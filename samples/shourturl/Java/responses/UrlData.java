package responses;

public class UrlData {
	
	private String code; //��� ���� �ڵ�
	private String message; //����޽��� or �����޽���
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
