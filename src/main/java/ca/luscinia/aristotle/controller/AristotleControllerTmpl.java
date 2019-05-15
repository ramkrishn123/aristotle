package ca.luscinia.aristotle.controller;

import ca.luscinia.aristotle.GetPropertyValues;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;
import java.util.Date;
import java.util.Properties;

public abstract class AristotleControllerTmpl {

    static Properties properties;
    private static void init() {
        try {
            properties = new GetPropertyValues().getPropValues();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void attachDebugObjects(ModelAndView modelAndView, HttpServletRequest request) {
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
}
