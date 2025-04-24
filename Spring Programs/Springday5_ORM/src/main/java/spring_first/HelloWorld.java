package spring_first;
import java.util.Iterator;
import org.hibernate.*;

public class HelloWorld {
	private SessionFactory sesfact;
	public void setSesfact(SessionFactory sesfact){
	this.sesfact = sesfact;
	}
	// 1. select statement...
	public Iterator getData(){
	Session ses=sesfact.openSession();
	
	Query query=ses.createQuery("select emp from Employee as emp");
	Iterator ii=query.iterate();
	return ii;
}
	//2. update statement...
	public void updateemp(int id, String name){
	    Session ses = sesfact.openSession();
	    Transaction tx = ses.beginTransaction();
	    Query query = ses.createQuery("update Employee set ename = :name where eid = :id");
	    query.setParameter("name", name);
	    query.setParameter("id", id);
	    query.executeUpdate();
	}
	    

	    
	
	
	
}