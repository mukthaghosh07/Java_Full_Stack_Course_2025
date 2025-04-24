package spring_first;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.updateemp(2, "Sumitha");
		Iterator ii = obj.getData();
		while(ii.hasNext()) {
			Employee e1 = (Employee)ii.next();
			System.out.println("Id: " + e1.getEid());
			System.out.println("name: " + e1.getEname());
		}
	}
}
