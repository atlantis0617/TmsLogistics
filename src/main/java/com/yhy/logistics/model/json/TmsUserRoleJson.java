package com.yhy.logistics.model.json;

public class TmsUserRoleJson {
	    private int roleId;
	    private String roleName;
	    private String comments;
	    private String isDelete;
	    private String createTime;
	    private String updateTime;
		
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
		public String getComments() {
			return comments;
		}
		public void setComments(String comments) {
			this.comments = comments;
		}
		public String getIsDelete() {
			return isDelete;
		}
		public void setIsDelete(String isDelete) {
			this.isDelete = isDelete;
		}
		public String getCreateTime() {
			return createTime;
		}
		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
		public String getUpdateTime() {
			return updateTime;
		}
		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

}
