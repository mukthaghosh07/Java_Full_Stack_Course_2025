package hibernate_first;

import org.hibernate.cfg.*;
import org.hibernate.*;
public class Client
{
public static void main(String[] args) throws Exception
{
Configuration conf=new Configuration();
conf=conf.configure();
SessionFactory factory=conf.buildSessionFactory();
Session ses=factory.openSession();
Transaction tx=ses.beginTransaction();

try {
    Credit credit = new Credit();
    credit.setEname("pnb");
    credit.setAccnum(123);
    credit.setAmount(3000);
    ses.update(credit); 

    Debit debit = new Debit();
    debit.setEname("icici");
    debit.setAccnum(100);
    debit.setAmount(2000);
    ses.update(debit);

    tx.commit();
    System.out.println("Transaction Successful!");

} catch (Exception e) {

        tx.rollback();
    System.out.println("Transaction failed");
} 
    ses.close();
    factory.close();
}
}
