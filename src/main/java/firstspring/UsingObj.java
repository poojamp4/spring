package firstspring;

public class UsingObj {
	private String name;
	private int id;
	private PersnalDetails p;
	
	public UsingObj(String name,int id,PersnalDetails p)
	{
		this.name=name;
		this.id=id;
		this.p=p;
	}
	
	public void display()
	{
		System.out.println("name of the person:"+this.name);
		System.out.println("person id:"+this.id);
		System.out.println("person details:"+this.p.toString());
	}
	

}
