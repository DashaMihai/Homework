public class MyException extends Exception {

	protected String details;

	public MyException(String details) {
		this.details = details;
	}

	public String getMessage() {
		return "Error:" + " " + details;
	}

}
