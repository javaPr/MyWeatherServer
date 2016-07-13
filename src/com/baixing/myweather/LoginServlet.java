package com.baixing.myweather;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.baixing.myweather.bean.Activity;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Activity> listActicity = new ArrayList<>();
		Activity activity = new Activity();
		activity.setContent("this is content");
		activity.setName("engineer 1");
		activity.setTime("2016-07-12");
		listActicity.add(activity);
		
		Activity activity1 = new Activity();
		activity1.setContent("this is content two");
		activity1.setName("engineer 233333");
		activity1.setTime("2016-07-12");
		listActicity.add(activity1);
		
		String json = new Gson().toJson(listActicity);
        response.setContentType("application/json");
        response.getWriter().write(json);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		StringBuilder sb = new StringBuilder();
//		BufferedReader br = request.getReader();
//		String str = null;
//		while ((str = br.readLine()) != null) {
//			sb.append(str);
//		}
//		System.out.println("str -> "+str.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//response.getWriter().append("Served at: ").append("helldsds");
		/*String email = request.getParameter("data");
		System.out.println(email);
		StringBuilder sb = new StringBuilder();
		BufferedReader br = request.getReader();
		String str = null;
		while ((str = br.readLine()) != null) {
			sb.append(str);
		}
		System.out.println("str -> "+str.toString());
		*/
		
		System.out.println("====================");
		
		Gson gson = new Gson();
        JsonParser parser = new JsonParser();
//        JsonObject obj = (JsonObject) parser
//                .parse(request.getParameter("data"));
        /*System.out.println();
        Iterator it = (Iterator) obj.entrySet();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
		*/
        System.out.println(request.getParameter("email"));
        String password = request.getParameter("password");
        System.out.println(password);
       
		List<Activity> listActicity = new ArrayList<>();
		
		Activity activity1 = new Activity();
		activity1.setContent("this is content two####");
		activity1.setName("engineer 233333");
		activity1.setTime("2016-07-12");
		listActicity.add(activity1);
		
		String json = new Gson().toJson(listActicity);
        response.setContentType("application/json");
        response.getWriter().write(json);
	}

}
