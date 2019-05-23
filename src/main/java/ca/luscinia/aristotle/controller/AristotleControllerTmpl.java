package ca.luscinia.aristotle.controller;

import ca.luscinia.aristotle.GetPropertyValues;
import org.json.JSONObject;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.time.Instant;
import java.util.Date;
import java.util.Properties;

public abstract class AristotleControllerTmpl {

	public Properties properties;

	public void init() {
		try {
			properties = new GetPropertyValues().getPropValues();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addHeadInfo(ModelAndView modelAndView) {
		init();
		modelAndView.addObject("title", properties.getProperty("site.title"));
		modelAndView.addObject("author", properties.get("site.author"));
		modelAndView.addObject("description", properties.getProperty("site.description"));
		modelAndView.addObject("url", properties.getProperty("site.url"));
	}

	public void attachDebugObjects(ModelAndView modelAndView, HttpServletRequest request) {
		modelAndView.addObject("output", "SAMPLE TEXT FROM CONTROLLER OUTPUT");
		if (request.getSession() != null) {
			modelAndView.addObject("SessionID", request.getSession().getId());
		} else {
			modelAndView.addObject("SessionID", "null");
		}
		modelAndView.addObject("Time", Date.from(Instant.now()).toString());
		modelAndView.addObject("Host", request.getHeader("Host"));
		modelAndView.addObject("UserAgent", request.getHeader("User-Agent"));
	}

	public boolean checkCaptchav2(String secretKey, String response) {
		try {
			String url = "https://www.google.com/recaptcha/api/siteverify?"
					+ "secret=" + secretKey
					+ "&response=" + response;
			InputStream res = new URL(url).openStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(res, Charset.forName("UTF-8")));

			StringBuilder sb = new StringBuilder();
			int cp;
			while ((cp = rd.read()) != -1) {
				sb.append((char) cp);
			}
			String jsonText = sb.toString();
			res.close();

			JSONObject json = new JSONObject(jsonText);
			return json.getBoolean("success");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	abstract ModelAndView index(HttpServletRequest request, HttpServletResponse response);
}
