package firstspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {

	public static void main(String[] args) 
	{
       ApplicationContext ac=new ClassPathXmlApplicationContext("application.xml");
       Employee e=(Employee)ac.getBean("employee");
       e.details();
      
	}

}
