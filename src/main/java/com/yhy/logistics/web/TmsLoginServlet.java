package com.yhy.logistics.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/tmsLoginServlet", description = "用户登陆")
public class TmsLoginServlet extends HttpServlet{

	private static final long serialVersionUID = -8302617640740390541L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String userName = req.getParameter("username");
		String psw = req.getParameter("password");
		System.out.println(userName+"值"+psw);
		resp.sendRedirect("mainFrame.html");
	}
	
}
