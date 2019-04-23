package firstspring;

public class Welcome {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void show()
	{
		System.out.println("hi"+this.getMessage());
	}

}
