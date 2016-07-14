import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.baixing.myweather.Utils;
import com.baixing.myweather.bean.Activity;

//import net.sf.json.JSONObject;

public class TestAPI {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<Activity> listActicity = new ArrayList<>();
		Activity activity = new Activity();
		activity.setDetails("this is content");
		activity.setEditor("engineer 1中");
		activity.setStarttime("2016-07-12");
		
		JSONObject jsonObj = new JSONObject();
		try {
			jsonObj.put("name", "这是名字");
			jsonObj.put("desc", "描述");
			System.out.println(jsonObj);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//JSONObject jsObj = JSONObject.fromObject(activity);  
        //System.out.println(jsObj.toString());  
//		String res = Utils.sendGet("http://172.17.0.211:1234/api/weather/further");
//		System.out.println("res -> "+res);
		
		

	}

}
