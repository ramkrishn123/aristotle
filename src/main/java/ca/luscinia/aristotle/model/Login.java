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

package ca.luscinia.aristotle.model;

public class Login {
    private String username;
    private String password;
    private String validate;

    public Login(){}
    public Login(String username, String password) {
        username = this.username;
        password = this.password;
    }
    public void validate(User user) {
        validate = "Student";
    }
    public boolean isStudent(Student student) {
        return this.validate.toLowerCase().equals("student");
    }
    public boolean isTeacher(Teacher teacher) {
        return this.validate.toLowerCase().equals("teacher");
    }
    public String processError() {
        if (validate == null) {
            return "Incorrect Username and/or Password";
        }
        return "An Unknown Error Occurred";
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setValidate(String validate) {
        this.validate = validate;
    }

    public String getValidate() {
        return validate;
    }

    @Override
    public String toString() {
        return getUsername() + ", " + getPassword() + ", error:\"" + getValidate() + "\"";
    }
}
