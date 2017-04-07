package com.fan.servlet;

import javax.servlet.http.HttpServlet;

public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp)
			throws javax.servlet.ServletException, java.io.IOException {
		String str = req.getParameter("username");
		System.out.println(str);
		//处理响应数据乱码
		resp.setContentType("text/html;charset=utf-8");
		resp.getWriter().print("请求返回");
	};
}
