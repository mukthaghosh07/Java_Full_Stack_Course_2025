package hibernate_first;

import org.hibernate.cfg.*;
import org.hibernate.*; 
import java.util.*;
import java.io.*; 
 
public class Client
{ 
public static void main(String[] args) throws Exception
{ 
FileInputStream fis=new FileInputStream("hibernate.properties");
Properties p=new Properties();
p.load(fis);
Configuration conf=new Configuration();
conf.setProperties(p);
conf.addFile("employee.hbm.xml");
SessionFactory factory=conf.buildSessionFactory(); 
Session ses=factory.openSession();
Transaction tx=ses.beginTransaction();
Employee e1=new Employee();


e1.setEid(110);
e1.setEname("Ankit");
ses.save(e1);


tx.commit();
System.out.println("successfully inserted details in Database..."); 
ses.close();
factory.close();
 
 
} 
} 