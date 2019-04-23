package firstspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestWelcome {

	public static void main(String[] args)
	{
         Resource res=new ClassPathResource("welcom.xml");
         BeanFactory b=new XmlBeanFactory(res);
         
         Object obj=b.getBean("welcome") ;
         Welcome w=(Welcome)obj;
         w.show();
         
         
	}

}
