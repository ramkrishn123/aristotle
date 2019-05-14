package ca.luscinia.aristotle.controller;

import ca.luscinia.aristotle.model.Student;

import javax.servlet.http.HttpSession;

public abstract class AuthenticatedController {
    public boolean isUnAuthenticated(HttpSession session) {
        String userType = session.getAttribute("userType").toString();
        if (userType.equals("student")) {
            Student student = (Student) session.getAttribute("user");
            student.
        }
    }
}
