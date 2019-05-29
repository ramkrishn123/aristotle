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

import org.json.JSONObject;

public class Student extends User {
	private int gradYear;
	private int[] proficiencies;
	private int[] styles;
	private String passwordResetKey;
	private JSONObject metadata;

	public int getGradYear() {
		return gradYear;
	}

	public void setGradYear(int gradYear) {
		this.gradYear = gradYear;
	}

	public int[] getProficiencies() {
		return proficiencies;
	}

	public void setProficiencies(int[] proficiencies) {
		this.proficiencies = proficiencies;
	}

	public int[] getStyles() {
		return styles;
	}

	public void setStyles(int[] styles) {
		this.styles = styles;
	}

	public String getPasswordResetKey() {
		return passwordResetKey;
	}

	public void setPasswordResetKey(String passwordResetKey) {
		this.passwordResetKey = passwordResetKey;
	}

	public JSONObject getMetadata() {
		return metadata;
	}

	public void setMetadata(JSONObject metadata) {
		this.metadata = metadata;
	}
}
