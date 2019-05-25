package ca.luscinia.aristotle;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropertyValues {
	public Properties getPropValues() throws IOException {
		Properties prop = new Properties();
		String propertiesFile = "aristotle.properties";
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propertiesFile);
		if (inputStream != null) {
			prop.load(inputStream);
		} else {
			return null;
		}
		return prop;
	}
}