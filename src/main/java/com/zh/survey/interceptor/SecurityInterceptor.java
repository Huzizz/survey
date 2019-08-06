package com.zh.survey.interceptor;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import com.alibaba.fastjson.JSONObject;

/**
 * 安全验证拦截器
 * @author Jim Green
 *
 */
@Component
public class SecurityInterceptor implements HandlerInterceptor {

	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		
		HttpSession session = request.getSession();
		
		if(session == null) {
			PrintWriter out = response.getWriter();
			JSONObject respJson = new JSONObject();
			respJson.put("success","false");
			respJson.put("msg","unLogin");
			out.append(respJson.toString());
			out.flush();
			out.close();
	        return false;
		}
		return true;
    }
}
