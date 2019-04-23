package firstspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollectn {

	public static void main(String[] args) {
		//ApplicationContext ac=new ClassPathXmlApplicationContext("collectn.xml");
		ApplicationContext ac=new ClassPathXmlApplicationContext("collectnref.xml");
		ConstrCollectn c=(ConstrCollectn)ac.getBean("lists");
		c.show();
		

	}

}
