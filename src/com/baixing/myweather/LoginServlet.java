package com.baixing.myweather;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.baixing.myweather.bean.Activity;
import com.baixing.myweather.bean.User;
import com.google.gson.Gson;
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
		activity.setDetails("this is content");
		activity.setEditor("engineer 1");
		activity.setStarttime("2016-07-12");
		listActicity.add(activity);
		
		Activity activity1 = new Activity();
		activity1.setDetails("this is content two");
		activity1.setEditor("engineer 233333");
		activity1.setStarttime("2016-07-12");
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
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user = new User();
        user.setUsername(email);
        user.setPassword(password);
        //String loginRes = Utils.sendGet("http://wdchang.github.io/mydata/jsondata.json");
        
       
       
/*		List<Activity> listActicity = new ArrayList<>();
		
		Activity activity1 = new Activity();
		activity1.setDetails("this is content two####");
		activity1.setEditor("engineer 233333");
		activity1.setStarttime("2016-07-12");
		listActicity.add(activity1);
		
		String json = new Gson().toJson(listActicity);*/
       
        System.out.println("========================");
        
        String res = Utils.sendPost("http://172.17.0.211:1234/api/user/login",new Gson().toJson(user));
        System.out.println(res);
        response.setContentType("application/json");
        response.getWriter().write(res);
        Cookie[] cookies = request.getCookies();
         
        System.out.println();
        System.out.println(cookies);
	}

}
