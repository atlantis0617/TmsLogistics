package com.yhy.logistics.model.base.user;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.yhy.logistics.model.base.entity.BaseEntity;

@Entity
@Table(name = "TMS_USER")
public class TmsUser extends BaseEntity{

	private static final long serialVersionUID = 6821002326999702622L;
	
	/**用户名*/
	private String userName;
	
	/**密码*/
	private String password;
	
	/**登录名*/
	private String loginName;
	
	/**性别*/
	private String sex;
	
	/**手机*/
	private String mobilePhone;
	
	/**邮箱*/
	private String email;
	
	/**状态*/
	private String status;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
