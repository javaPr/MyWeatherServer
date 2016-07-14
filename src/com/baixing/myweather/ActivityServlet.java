package com.baixing.myweather;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.baixing.myweather.bean.Activity;
import com.google.gson.Gson;

/**
 * Servlet implementation class ActivityServlet
 */
@WebServlet("/ActivityServlet")
public class ActivityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActivityServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doPost(request,response);
		List<Activity> listActicity = new ArrayList<>();
		Activity activity = new Activity();
		activity.setDetails("this is content");
		activity.setEditor("engineer 1");
		activity.setStarttime("2016-07-12");
		listActicity.add(activity);
		
		Activity activity1 = new Activity();
		activity1.setDetails("this is content two");
		activity1.setEditor("engineer 2");
		activity1.setStarttime("2016-07-12");
		listActicity.add(activity1);
		
		String json = new Gson().toJson(listActicity);
        response.setContentType("application/json");
        response.getWriter().write(json);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
