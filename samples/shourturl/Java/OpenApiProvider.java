import java.net.*;
import javax.xml.parsers.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import responses.*;

public class OpenApiProvider {
	
	public static UrlData requestUrlApi(String orgurl) throws Exception {
		//��ũ �ּ� �����
		StringBuffer requestUrl = new StringBuffer();
		requestUrl.append(RequestUrls.REQUEST_URL);
		requestUrl.append("?url="); 
		requestUrl.append(orgurl);
		URL url = new URL(requestUrl.toString());
		
		//API ��û �� ��ȯ
		URLConnection conn = url.openConnection();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(conn.getInputStream());
		
		//�� �Ϸ� ��ü �����
		UrlData data = new UrlData();
		
		//channel��带 ��üȭ �ϱ�
		Node node = doc.getElementsByTagName("result").item(0);
		for (int i=0 ;i< node.getChildNodes().getLength();i++) {
			Node channelNode = node.getChildNodes().item(i);
			String nodeName = channelNode.getNodeName();
			if ("code".equals(nodeName))
				data.setCode(channelNode.getTextContent());
			else if ("message".equals(nodeName))
				data.setMessage(channelNode.getTextContent());
			else if ("result".equals(nodeName)) {
				//item��带 ��üȭ �ϱ�
				UrlItemData urlItem = new UrlItemData(); 
				for (int j=0 ;j< channelNode.getChildNodes().getLength();j++) {
					Node itemNode = channelNode.getChildNodes().item(j);
					if("url".equals(itemNode.getNodeName()))					
						urlItem.setUrl(itemNode.getTextContent());
					else if("orgUrl".equals(itemNode.getNodeName()))
						urlItem.setOrgurl(itemNode.getTextContent());
					else if("hash".equals(itemNode.getNodeName()))
						urlItem.setHash(itemNode.getTextContent());
				}
				data.setItem(urlItem);
			}
		}
		return data;
	}
}
