package firstspring;

public class PersnalDetails {
	private String mobilenum;
	private String place;
	private int age;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    public String getMobilenum() {
		return mobilenum;
	}
	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString()
	{
		return this.name+"\n mobilenum: "+this.mobilenum+" \n"+"place: "+this.place+"\n " + "age: "+this.age;
		
	}
	
		
	

}
