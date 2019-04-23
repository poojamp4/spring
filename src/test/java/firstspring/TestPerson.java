package firstspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		ApplicationContext appl=new ClassPathXmlApplicationContext("details.xml");
		UsingObj obj=(UsingObj)appl.getBean("details");
		obj.display();

	}

}
