package spring_first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
		Employee2 dao=(Employee2)ctx.getBean("hey");

		int aa = dao.viewEmployee(new Employee(2, "Muktha"));
        System.out.println(aa);
        System.out.println("row updated.....");
		}
}