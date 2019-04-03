package Business;

public class ValidatorExeption  extends Exception{


	private static final long serialVersionUID = 1L;
	private String msg ;


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public ValidatorExeption() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ValidatorExeption(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public ValidatorExeption(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public ValidatorExeption(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ValidatorExeption(String msg) {
		super();
		this.msg = msg;
	}
	

}
