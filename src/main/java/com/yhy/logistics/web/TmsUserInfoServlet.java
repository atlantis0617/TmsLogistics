package com.yhy.logistics.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.yhy.logistics.model.json.TmsUserInfoJson;
import com.yhy.logistics.model.json.TmsUserJson;
import com.yhy.logistics.model.json.TmsUserRoleJson;

@WebServlet(urlPatterns = "/showUserInfo", description = "用户信息展示")
public class TmsUserInfoServlet extends HttpServlet{

	private static final long serialVersionUID = 7214921313303383755L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		int page = Integer.parseInt(req.getParameter("page"));
		int limit = Integer.parseInt(req.getParameter("limit"));	
		System.out.println(page);
		System.out.println(limit);
		
		TmsUserInfoJson infos = new TmsUserInfoJson();
		infos.setCode(0);
		infos.setMsg("");
		infos.setCount(11);
		
		List<TmsUserJson> datas = new ArrayList<TmsUserJson>();
		for (int i = 0; i < 11; i++) {
			TmsUserJson data = new TmsUserJson();
			data.setUserId(i);
			data.setUsername("test"+i);
			data.setPassword("123456");
			data.setNickName("管理员");
			data.setAvatar(null);
			data.setSex("男");
			data.setPhone("110"+i);
			data.setEmail("123@qq.com");
			data.setEmailVerified(null);
			data.setPersonId(null);
			data.setPersonType(null);
			data.setState(0);
			data.setCreateTime(new Date());
			data.setUpdateTime(new Date());
			data.setRoleId(1);
			data.setRoleName("管理员");
			
			List<TmsUserRoleJson> roles = new ArrayList<TmsUserRoleJson>();
			TmsUserRoleJson role = new TmsUserRoleJson();
			role.setRoleId(1);
			role.setRoleName("管理员");
			role.setComments(null);
			role.setIsDelete(null);
			role.setCreateTime(null);
			role.setUpdateTime(null);
			roles.add(role);
			
			data.setRoles(roles);
			datas.add(data);
		}
		infos.setData(datas);
		String json = JSON.toJSONString(infos);
		System.out.println(json);
		resp.getWriter().write(json);
	}
	
}
