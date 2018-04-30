package com.dhxl33.login_user.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息
 * 
 * @author 郭宏涛
 *
 */
public class UserInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	// 与用户登录实体的user_id保持一致
	private String user_id;

	private String real_name;

	private String sex;

	private Date birthday;

	private String address;

	private String telephone;

	public UserInfo() {
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
