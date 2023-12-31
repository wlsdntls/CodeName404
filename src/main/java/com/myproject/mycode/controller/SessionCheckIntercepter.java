package com.myproject.mycode.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.myproject.mycode.model.MemberModel;

public class SessionCheckIntercepter extends HandlerInterceptorAdapter{

	// preHandle(request,response,handler)메소드
	// 1.Controller에서 요청(*.nhn)을 받기 전에  preHandle()가 호출되어 가로채는 역할로 사용
	// 2.로그인 하지않고(세션이 없으면) 요청하면 로그인 폼으로 이동 하도록 해주는 역할
	
	// servlet-context.xml 에 가로챌  파일 저장함
	public boolean preHandle(HttpServletRequest request,
		HttpServletResponse response, Object handler) throws Exception {
		HttpSession session = request.getSession();
		MemberModel id = (MemberModel)session.getAttribute("memberModel");
		if(id == null || id.equals("")) {
			response.sendRedirect("login_form.do");
			return false;
		}
		return true;
	}
}
