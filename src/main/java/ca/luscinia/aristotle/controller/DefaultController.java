/*
 * Aristotle Learning Platform: Luscinia Enterprises Assn.
 * Copyright (C) 2019  Varun Patel <varun@varunpatel.ca>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package ca.luscinia.aristotle.controller;


import ca.luscinia.aristotle.GetPropertyValues;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Properties;

@Controller
public class DefaultController extends AristotleControllerTmpl {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public static ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        init();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("title", properties.getProperty("site.title"));
        attachDebugObjects(modelAndView, request);
        return modelAndView;
    }
}
