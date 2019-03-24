package dom;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.Country;

public class DomParser
{
    public List<Country> parse(Document document) throws FileNotFoundException, XMLStreamException
    {
        NodeList nodeList = document.getElementsByTagName("Country");//получаем список node
        List<Country> countries = new ArrayList<Country>();
        for (int i = 0; i < nodeList.getLength(); i++)// идем по всем
        {
        	countries.add(getCountry(nodeList.item(i)));//принимает ноду из нода 
        }
        return countries;
    }

    private static Country getCountry(Node node)
    {
    	Country country = new Country();
        Element element = (Element) node; //приведение для того чтобы достть значения
        country.setId(Integer.parseInt(element.getAttribute("id")));
        country.setCode(getTagValue("Code", element));
        country.setName(getTagValue("Name", element));
        country.setDescription(getTagValue("Description", element));
       
        return country;
    }

    private static String getTagValue(String tag, Element element)
    {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = nodeList.item(0);
        return node.getNodeValue();
    }
}
