package hibernate_first;

import org.hibernate.*;
import org.hibernate.cfg.*;
public class Client {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        conf.setProperty("hibernate.connection.dialect","org.hibernate.dialect.MySQL5Dialect");
        conf.setProperty("hibernate.connection.url","jdbc:mysql://localhost/jfs");
        conf.setProperty("hibernate.connection.username","root");
        conf.setProperty("hibernate.connection.password","password");
        conf.setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
        conf.addFile("employee.hbm.xml");
        
        //conf = conf.configure(); // loads hibernate.cfg.xml
        SessionFactory factory = conf.buildSessionFactory();
        Session ses = factory.openSession();
        Transaction tx = ses.beginTransaction();

        Employee e1 = new Employee();
        e1.setEid(109);
        e1.setEname("Muktha Ghosh");
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
