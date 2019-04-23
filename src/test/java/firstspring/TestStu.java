/**
 * 
 */
package firstspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shubha
 *
 */
public class TestStu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("student.xml");
		Student s=(Student)ap.getBean("student");
		s.details();
		

	}

}
