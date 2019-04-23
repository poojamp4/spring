package firstspring;

import java.util.Iterator;
import java.util.List;

public class ConstrCollectn {
	private String office;
	private int totalmemb;
	private String name;
	private List<PersnalDetails> details;
	//private List<String> name;
	
	public ConstrCollectn(String office,int totalmemb,List<PersnalDetails> details)
	{
		this.office=office;
		this.totalmemb=totalmemb;
		this.details=details;
	}
	
	public void show()
	{
		System.out.println("currently working in "+this.office+" with "+this.totalmemb+" team members");
		System.out.println("team members and their details:");
		Iterator itr=details.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
	
	

}
