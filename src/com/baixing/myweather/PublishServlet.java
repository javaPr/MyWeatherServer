package com.baixing.myweather;

import java.io.IOException;
import java.util.TimeZone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.baixing.myweather.bean.Activity;
import com.baixing.myweather.bean.PublishMsg;
import com.google.gson.Gson;

/**
 * Servlet implementation class PublishServlet
 */
@WebServlet("/PublishServlet")
public class PublishServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PublishServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai")); 
		String share = request.getParameter("share");
        String detail = request.getParameter("detail");
        String time = request.getParameter("time");
        String title = request.getParameter("title");
        Activity activity = new Activity(share,detail,time);
        activity.setTitle(title);
        
        String json = new Gson().toJson(activity);
        System.out.println(json);
        System.out.println(Utils.session_id);
        String res = Utils.sendPost("http://172.17.0.211:1234/api/adboard/add", json);
        System.out.println(res);
        PublishMsg msg = new Gson().fromJson(res, PublishMsg.class);
        System.out.println(msg.getMsg());
        
	}

}
