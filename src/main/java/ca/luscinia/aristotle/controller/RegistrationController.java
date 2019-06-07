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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class RegistrationController extends AristotleControllerTmpl {

	@RequestMapping(value = "/register/", method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("login");
		addHeadInfo(modelAndView);
		modelAndView.addObject("email", "user@example.com");
		return modelAndView;
	}

	@RequestMapping(value = "/register/student", method = RequestMethod.POST)
	public ModelAndView rStudent(@RequestParam("classCode") int classCode,  HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("registerstudent");
		addHeadInfo(modelAndView);
		modelAndView.addObject("classCode", classCode);
		return modelAndView;
	}

	@RequestMapping(value = "/register/process/", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	                                 @RequestParam("username") String username,
	                                 @RequestParam("firstName") String firstName,
	                                 @RequestParam("lastName") String lastName,
	                                 @RequestParam("classCode") String classCode,
	                                 @RequestParam("classKey") String classKey,
	                                 @RequestParam("password") String password,
                                     @RequestParam("verify") String verify
	) {


		return null;

	}
}
