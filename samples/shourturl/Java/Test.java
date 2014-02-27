import responses.*;


public class Test {

	public static void main(String[] args) throws Exception {
		UrlData data = OpenApiProvider.requestUrlApi("http://0u0.kr"); //단축하고자 하는 URL을 넣으세요.
		
		//출력하기
		System.out.println("code : "+data.getCode());
		System.out.println("message : "+data.getMessage());
		if("200".equals(data.getCode())) { //정상적일 경우
			System.out.println("url : "+data.getItem().getUrl());
			System.out.println("hash : "+data.getItem().getHash());
			System.out.println("orgurl : "+data.getItem().getOrgurl());
		}
	}
}
