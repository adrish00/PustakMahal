/**
 * 
 */
package com.pustakmahal.it.model;

/**
 * @author Adrish Bhattacharyay
 * @version 1.0
 */
public class UserInfo {
	public UserInfo(String user_name, String password, String first_name,
			String middle_name, String last_name, String email_id,
			String mobile_no, String mobile_no_alternate, String date_of_birth) {
		super();
		this.user_name = user_name;
		this.password = password;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.email_id = email_id;
		this.mobile_no = mobile_no;
		this.mobile_no_alternate = mobile_no_alternate;
		this.date_of_birth = date_of_birth;
	}

	private String user_name;
	private String password;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String email_id;
	private String mobile_no;
	private String mobile_no_alternate;
	private String date_of_birth;

	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}

	/**
	 * @param user_name
	 *            the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}

	/**
	 * @param first_name
	 *            the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * @return the middle_name
	 */
	public String getMiddle_name() {
		return middle_name;
	}

	/**
	 * @param middle_name
	 *            the middle_name to set
	 */
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}

	/**
	 * @param last_name
	 *            the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	/**
	 * @return the email_id
	 */
	public String getEmail_id() {
		return email_id;
	}

	/**
	 * @param email_id
	 *            the email_id to set
	 */
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	/**
	 * @return the mobile_no
	 */
	public String getMobile_no() {
		return mobile_no;
	}

	/**
	 * @param mobile_no
	 *            the mobile_no to set
	 */
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	/**
	 * @return the mobile_no_alternate
	 */
	public String getMobile_no_alternate() {
		return mobile_no_alternate;
	}

	/**
	 * @param mobile_no_alternate
	 *            the mobile_no_alternate to set
	 */
	public void setMobile_no_alternate(String mobile_no_alternate) {
		this.mobile_no_alternate = mobile_no_alternate;
	}

	/**
	 * @return the date_of_birth
	 */
	public String getDate_of_birth() {
		return date_of_birth;
	}

	/**
	 * @param date_of_birth
	 *            the date_of_birth to set
	 */
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
}
