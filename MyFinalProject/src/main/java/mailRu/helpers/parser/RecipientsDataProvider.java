package mailRu.helpers.parser;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import mailRu.helpers.parser.Arguments;;

public class RecipientsDataProvider {
	private static final String ARGUMENTS_XML = "src/main/resources/Arguments.xml";
	private Arguments arguments;

	public Arguments getArguments(Document document) {
		NodeList nodeList = document.getElementsByTagName("Arguments");
		arguments = getArgument(nodeList.item(0));
		return arguments;
	}

	private static Arguments getArgument(Node node) {
		Arguments arguments = new Arguments();
		Element element = (Element) node;
		arguments.setRecipients(getTagValue("recipients", element));
		arguments.setSubject(getTagValue("subject", element));
		return arguments;
	}

	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = nodeList.item(0);
		return node.getNodeValue();
	}

	public Arguments parse() throws ParserConfigurationException, IOException, SAXException {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document document = dBuilder.parse(ARGUMENTS_XML);
		arguments = getArguments(document);
		return arguments;
	}

}
