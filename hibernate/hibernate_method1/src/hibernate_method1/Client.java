package hibernate_method1;

import org.hibernate.*;
import org.hibernate.cfg.*;
public class Client {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        // for loading hibernate confriguration method
        conf.setProperty("connection.driver_class","com.mysql.cj.jdbc.Driver");
        
        conf.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/jfs");
        conf.setProperty("hibernate.connection.username","root");
        conf.setProperty("hibernate.connection.password","10896");
        conf.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
        conf.addFile("employee.hbm.xml");
        
      //  conf = conf.configure(); // loads hibernate.cfg.xml
        SessionFactory factory = conf.buildSessionFactory();
        Session ses = factory.openSession();
        Transaction tx = ses.beginTransaction();

        Employee e1 = new Employee();
        e1.setEid(109);
        e1.setEname("Ankit");
       ses.save(e1);
       
//       Employee e1= new Employee();
//       e1.setEid(107);
//       e1.setEname("Livetech");
//       ses.update(e1);
       
       //ses.delete(e1)
        tx.commit();
        System.out.println("Successfully inserted details in Database...");
        ses.close();
        factory.close();
    }
}
