package ca.luscinia.aristotle.controller;

import ca.luscinia.aristotle.model.Student;
import ca.luscinia.aristotle.model.Teacher;

import javax.servlet.http.HttpSession;

public abstract class AuthenticatedController {
    public char isAuthenticated(HttpSession session) {
        String userType = session.getAttribute("userType").toString();
        if (userType == null) {
            return 'l'; // not logged in for this session
        } else if (userType.equals("student")) {
            Student student = (Student) session.getAttribute("user");
            if (student.isAuthenticated()) {
                return 's'; // logged in as student for this session
            }
            return 'e'; // authentication error
        } else if (userType.equals("teacher")) {
            Teacher teacher = (Teacher) session.getAttribute("user");
            if (teacher.isAuthenticated()) {
                return 't';
            }
            return 'e'; // authentication error
        }
        return 'a';
    }
}
