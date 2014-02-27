import responses.*;


public class Test {

	public static void main(String[] args) throws Exception {
		UrlData data = OpenApiProvider.requestUrlApi("http://0u0.kr"); //�����ϰ��� �ϴ� URL�� ��������.
		
		//����ϱ�
		System.out.println("code : "+data.getCode());
		System.out.println("message : "+data.getMessage());
		if("200".equals(data.getCode())) { //�������� ���
			System.out.println("url : "+data.getItem().getUrl());
			System.out.println("hash : "+data.getItem().getHash());
			System.out.println("orgurl : "+data.getItem().getOrgurl());
		}
	}
}
