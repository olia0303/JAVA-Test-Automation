package core;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.junit.Before;
import org.junit.Test;

public class TestVkApi {
	private VkApi vkApi;
	private HttpResponse response;

	@Before
	public void setUp() throws Exception {
		vkApi = new VkApi();
	}

	@Test
	public void testWallPost() throws URISyntaxException, ClientProtocolException, IOException {
		response = vkApi.wallPost();
		assertEquals(200, response.getStatusLine().getStatusCode());
	}

	@Test
	public void testWallEdit() throws URISyntaxException, ClientProtocolException, IOException {
		response = vkApi.wallEdit();
		assertEquals(200, response.getStatusLine().getStatusCode());
	}

	@Test
	public void testWallDelete() throws URISyntaxException, ClientProtocolException, IOException {
		response = vkApi.wallDelete();
		assertEquals(200, response.getStatusLine().getStatusCode());
	}

}
