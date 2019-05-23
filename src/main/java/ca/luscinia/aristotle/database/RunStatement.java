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

package ca.luscinia.aristotle.database;

import ca.luscinia.aristotle.GetPropertyValues;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class RunStatement {
	public ResultSet queryUsers(String query) throws IOException {
		Properties properties = new GetPropertyValues().getPropValues();
		try {
			Class.forName(properties.getProperty("db.sql.driver"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// create Connection
		Connection connection;
		// create Statement
		Statement statement;
		// default output to null
		ResultSet output = null;
		// query db
		try {
			//connect to database using connection and url
			connection = DriverManager.getConnection("jdbc:" + properties.getProperty("db.sql.engine") +
							"://" + properties.getProperty("db.users.url") +
							":" + properties.getProperty("db.users.port") +
							"/" + properties.getProperty("db.users.name"),
					properties.getProperty("db.users.username"),
					properties.getProperty("db.users.password"));
			//connect statement to new connection
			statement = connection.createStatement();
			//execute query and send output to resultset output
			output = statement.executeQuery(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return output;
	}
}
