package ca.luscinia.aristotle.controller;

import ca.luscinia.aristotle.GetPropertyValues;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

	abstract ModelAndView index(HttpServletRequest request, HttpServletResponse response);
}
