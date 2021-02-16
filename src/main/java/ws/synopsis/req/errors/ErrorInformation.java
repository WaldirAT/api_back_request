package ws.synopsis.req.errors;

public class ErrorInformation {
	
	private int code;
	
	private String msg;
	
	public ErrorInformation() {
		
	}

	public ErrorInformation(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
