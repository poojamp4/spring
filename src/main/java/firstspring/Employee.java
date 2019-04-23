package firstspring;

public class Employee {
	private int Empid;
	private String name;
	private String place;
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	public Employee(String name,String place)
	{
		this.name=name;
		this.place=place;
	}
	
	void details()
	{
		System.out.println(this.name+" "+this.place);
	}
	

}
