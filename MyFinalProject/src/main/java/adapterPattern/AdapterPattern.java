package adapterPattern;

import adapterPattern.JSONObject;
import adapterPattern.JSONResponse;
import adapterPattern.XMLResponse;
import adapterPattern.XMLResponseAdapter;

public class AdapterPattern {
	public static boolean AdapterConvertJsonXML(String postAdapter) {
		JSONObject JSONObject = new JSONObject(postAdapter);
		JSONResponse jSONResponse = new JSONResponse(JSONObject);

		XMLResponse xMLResponse = new XMLResponse();
		XMLResponseAdapter XMLResponseAdapter = new XMLResponseAdapter(xMLResponse.getXMLObject());

		return jSONResponse.isJSONEqual(XMLResponseAdapter.getJSONObject());
	}
}
