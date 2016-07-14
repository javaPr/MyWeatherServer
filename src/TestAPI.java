import java.io.IOException;

import com.baixing.myweather.Utils;

public class TestAPI {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String res = Utils.sendGet("http://172.17.0.211:1234/api/weather/further");
		System.out.println("res -> "+res);
		
		

	}

}
