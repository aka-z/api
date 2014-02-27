package responses;

public class UrlItemData {
	
	private String url; //단축 URL
	private String orgurl; //원본 URL
	private String hash; //단축 URL Hash 정보
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getOrgurl() {
		return orgurl;
	}
	public void setOrgurl(String orgurl) {
		this.orgurl = orgurl;
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	
}
