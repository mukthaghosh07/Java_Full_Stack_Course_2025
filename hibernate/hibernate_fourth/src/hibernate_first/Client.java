package hibernate_first;

import org.hibernate.*;
import org.hibernate.cfg.*;
public class Client {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        
        conf = conf.configure(); // loads hibernate.cfg.xml
        conf.addAnnotatedClass(Employee.class); 

        SessionFactory factory = conf.buildSessionFactory();
        Session ses = factory.openSession();
        Transaction tx = ses.beginTransaction();

        Employee e1 = new Employee();
        e1.setEid(108);
        e1.setEname("Muktha");
       ses.save(e1);
       // for this file I am using update method
        
//       Employee e1= new Employee();
//       e1.setEid(110);
//       e1.setEname("Sailen");
//       ses.update(e1);
       
       //ses.delete(e1)
        tx.commit();
        System.out.println("Successfully inserted details in Database...");
        ses.close();
        factory.close();
    }
}
