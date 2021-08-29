package adapter;

import java.util.Map;

public interface HttpAdapter {

	public abstract void post(String url, Map<String, Object> data);

}
