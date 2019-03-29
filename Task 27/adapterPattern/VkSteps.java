package vkApiWebServiceTest;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.util.EntityUtils;
import org.junit.Assert;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import vkApiWebService.VkApiWebService;
import adapterPattern.AdapterPattern;;

public class VkSteps {
	VkApiWebService service = new VkApiWebService();
	private static String posId;
	private static String postAdapter;
	private static int actualResponseCode;
	public static final String OWNER_ID = "7573223";

	@When("^I post on wall$")
	public void wallPost() throws ParseException, IOException, URISyntaxException {
		HttpResponse getResponse = new VkApiWebService().setMethod("post").setParameters("owner_id", OWNER_ID)
				.setParameters("message", "My test").callMethods();
		postAdapter = (EntityUtils.toString(getResponse.getEntity()));
		posId = postAdapter.replaceAll("[^0-9]", "");
		System.out.println(postAdapter);
		actualResponseCode = getResponse.getStatusLine().getStatusCode();
	}

	@Then("^Post added to the wall$")
	public void postAddedTest() {
		Assert.assertEquals(200, actualResponseCode);
	}

	@When("^I edit post on wall$")
	public void editPost() throws URISyntaxException, ClientProtocolException, IOException {
		HttpResponse getResponse = new VkApiWebService().setMethod("edit").setParameters("owner_id", OWNER_ID)
				.setParameters("post_id", posId).setParameters("message", "My edit test").callMethods();
		postAdapter = (EntityUtils.toString(getResponse.getEntity()));
		posId = postAdapter.replaceAll("[^0-9]", "");
		System.out.println(postAdapter);
	}

	@When("^I delete post from the wall$")
	public void deletePost() throws URISyntaxException, ClientProtocolException, IOException {
		HttpResponse getResponse = new VkApiWebService().setMethod("delete").setParameters("owner_id", OWNER_ID)
				.setParameters("post_id", posId).callMethods();
		postAdapter = (EntityUtils.toString(getResponse.getEntity()));
		posId = postAdapter.replaceAll("[^0-9]", "");
		System.out.println(postAdapter);
	}

	@Then("^I check changes after adapter$")
	public void checkChangesAfterAdapter() {
		System.out.println(AdapterPattern.AdapterConvertJsonXML(postAdapter));
		Assert.assertTrue(AdapterPattern.AdapterConvertJsonXML(postAdapter));
	}

}
