package spring_first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
public static void main(String[] args)
{
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	file1 obj = (file1) context.getBean("m1");

	obj.myMessage();
}
}