package spring_first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
		Employee2 dao=(Employee2)ctx.getBean("hey");
//		String aa = dao.viewEmployee(new Employee(2, "Ankit"));
		String aa =dao.viewEmployee();
        System.out.println(aa);
        System.out.println("table drop succrssfully");
        
        
		}
}