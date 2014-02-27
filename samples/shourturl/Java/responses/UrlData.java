package responses;

public class UrlData {
	
	private String code; //결과 상태 코드
	private String message; //결과메시지 or 에러메시지
	private UrlItemData item = new UrlItemData();
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public UrlItemData getItem() {
		return item;
	}
	public void setItem(UrlItemData item) {
		this.item = item;
	}
	
}
