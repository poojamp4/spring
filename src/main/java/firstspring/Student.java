package firstspring;

public class Student {
	private PersnalDetails p;
	private int id;
	
	public PersnalDetails getP() {
		return p;
	}
	public void setP(PersnalDetails p) {
		this.p = p;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void details()
	{
		System.out.println(id);
		System.out.println(this.p.toString());
	}
	
	

}
