package com.yhy.logistics.model.json;

import java.util.List;

public class TmsUserInfoJson {
	
	 	private int code;
	    private String msg;
	    private int count;
	    private List<TmsUserJson> data;
		
	    public int getCode() {
			return code;
		}
		public void setCode(int code) {
			this.code = code;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		public List<TmsUserJson> getData() {
			return data;
		}
		public void setData(List<TmsUserJson> data) {
			this.data = data;
		}

}
