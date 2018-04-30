package com.dhxl33.login_user.pojo;

import java.io.Serializable;

/**
 * 用户登陆次数
 * 
 * @author 郭宏涛
 *
 */
public class UserCount implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String user_id;

	private Integer count;

	public UserCount() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}
