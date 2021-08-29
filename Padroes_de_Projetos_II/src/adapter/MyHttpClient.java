package adapter;

import java.util.Map;

import com.google.gson.Gson;

public class MyHttpClient implements HttpAdapter {

	@Override
	public void post(String url, Map<String, Object> data) {
		System.out.println(String.format("POST\n%s\n%s", url, new Gson().toJson(data)));
	}

}
