package com.test.Utilitites;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtils {
	
	public String readXML(String fileName,String tagName)
	{
		File file=new File(fileName);
		String value=null;
		try
		{
			DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
			DocumentBuilder db=dbf.newDocumentBuilder();
			Document doc=db.parse(file);
			doc.getDocumentElement().getNodeName();
			NodeList list=doc.getElementsByTagName(tagName);
			for(int i=0;i<list.getLength();i++)
			{
				Node node=list.item(i);
				if(node.getNodeType()==Node.ELEMENT_NODE)
				{
					Element element=(Element) node;
					value=element.getElementsByTagName("name").item(0).getTextContent()+"~"+element.getElementsByTagName("value").item(0).getTextContent();
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}

}
