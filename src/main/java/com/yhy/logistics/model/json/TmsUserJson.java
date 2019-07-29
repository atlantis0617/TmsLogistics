package com.yhy.logistics.model.json;

import java.util.Date;
import java.util.List;

public class TmsUserJson {
	    private int userId;
	    private String username;
	    private String password;
	    private String nickName;
	    private String avatar;
	    private String sex;
	    private String phone;
	    private String email;
	    private String emailVerified;
	    private String personId;
	    private String personType;
	    private int state;
	    private Date createTime;
	    private Date updateTime;
	    private int roleId;
	    private String roleName;
	    private List<TmsUserRoleJson> roles;
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getNickName() {
			return nickName;
		}
		public void setNickName(String nickName) {
			this.nickName = nickName;
		}
		public String getAvatar() {
			return avatar;
		}
		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getEmailVerified() {
			return emailVerified;
		}
		public void setEmailVerified(String emailVerified) {
			this.emailVerified = emailVerified;
		}
		public String getPersonId() {
			return personId;
		}
		public void setPersonId(String personId) {
			this.personId = personId;
		}
		public String getPersonType() {
			return personType;
		}
		public void setPersonType(String personType) {
			this.personType = personType;
		}
		public int getState() {
			return state;
		}
		public void setState(int state) {
			this.state = state;
		}
		public Date getCreateTime() {
			return createTime;
		}
		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}
		public Date getUpdateTime() {
			return updateTime;
		}
		public void setUpdateTime(Date updateTime) {
			this.updateTime = updateTime;
		}
		public int getRoleId() {
			return roleId;
		}
		public void setRoleId(int roleId) {
			this.roleId = roleId;
		}
		public String getRoleName() {
			return roleName;
		}
		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}
		public List<TmsUserRoleJson> getRoles() {
			return roles;
		}
		public void setRoles(List<TmsUserRoleJson> roles) {
			this.roles = roles;
		}

}
