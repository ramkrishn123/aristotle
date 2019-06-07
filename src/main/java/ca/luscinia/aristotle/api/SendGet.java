package ca.luscinia.aristotle.api;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

public class SendGet {
	public JSONObject sendRequest(String api, String params){
		try {
			String url = "https://" + api + "?" + params;
			InputStream res = new URL(url).openStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(res, Charset.forName("UTF-8")));

			StringBuilder sb = new StringBuilder();
			int cp;
			while ((cp = rd.read()) != -1) {
				sb.append((char) cp);
			}
			String jsonText = sb.toString();
			res.close();

			return new JSONObject(jsonText);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
