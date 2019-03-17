package core;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class VkApi {
	public static final String URL = "https://api.vk.com/method/";
	public static final String ACCESS_TOKEN = "d42dbdcdad6b3479c5cd25848693f49c372137c97ee9d3c6c305689675eadac773ffb239a48c9540a148b";
	public static final String OWNER_ID = "536083852";
	public static final String VERSION = "5.92";
	public static final String MESSAGE = "My test";
	public static final String EDIT_MESSAGE = "My test is successful";
	private static String id;
	HttpClient client = HttpClientBuilder.create().build();

	public HttpResponse wallPost() throws URISyntaxException, ClientProtocolException, IOException {
		URIBuilder builder = new URIBuilder(URL + "wall.post?");
		builder.setParameter("access_token", ACCESS_TOKEN).setParameter("owner_id", OWNER_ID)
				.setParameter("message", MESSAGE).setParameter("v", VERSION);
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		id = (EntityUtils.toString(response.getEntity()));
		id = id.substring(23, 25);
		return response;
	}

	public HttpResponse wallEdit() throws URISyntaxException, ClientProtocolException, IOException {
		URIBuilder builder2 = new URIBuilder(URL + "wall.edit?");
		builder2.setParameter("access_token", ACCESS_TOKEN).setParameter("owner_id", OWNER_ID)
				.setParameter("post_id", id).setParameter("message", EDIT_MESSAGE).setParameter("v", VERSION);
		HttpGet request2 = new HttpGet(builder2.build());
		HttpResponse response2 = client.execute(request2);
		return response2;
	}

	public HttpResponse wallDelete() throws URISyntaxException, ClientProtocolException, IOException {
		URIBuilder builder3 = new URIBuilder(URL + "wall.delete?");
		builder3.setParameter("access_token", ACCESS_TOKEN).setParameter("owner_id", OWNER_ID)
				.setParameter("post_id", id).setParameter("v", VERSION);
		HttpGet request3 = new HttpGet(builder3.build());
		HttpResponse response3 = client.execute(request3);
		return response3;
	}
}
