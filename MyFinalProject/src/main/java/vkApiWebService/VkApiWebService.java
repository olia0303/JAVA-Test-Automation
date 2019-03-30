package vkApiWebService;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.log4j.Logger;

public class VkApiWebService {

	private static final String URL = "https://api.vk.com/method/wall.%s?";
	private static final String ACCESS_TOKEN = "70e1ea863c6484a9ac16d468e60278a0a90af273efd3c2d5b4dbb325db173c641865ad87c03023e6998f8";
	private static final String VERSION = "5.92";
	private static final Logger logger = Logger.getLogger(VkApiWebService.class);
	private HttpClient client;
	private URIBuilder uri;

	public VkApiWebService() {
		client = HttpClientBuilder.create().build();
	}

	public VkApiWebService setMethod(String path) throws URISyntaxException {

		uri = new URIBuilder(String.format(URL, path));
		uri.setParameter("access_token", ACCESS_TOKEN).setParameter("v", VERSION);
		logger.info("Failed to send request");
		return this;
	}

	public VkApiWebService setParameters(String parameters, String value) {
		uri.setParameter(parameters, value);
		return this;
	}

	public HttpResponse callMethods() throws ClientProtocolException, IOException, URISyntaxException {
		HttpResponse response = null;
		HttpGet getRequest = new HttpGet(uri.build());
		response = client.execute(getRequest);
		logger.info("Failed to get response");
		return response;
	}

}
