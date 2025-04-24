package spring_first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
public static void main(String[] args)
{
ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
File_auto1 obj = (File_auto1) context.getBean("two");
String name= obj.displayMessage();
System.out.println(name);
}
}