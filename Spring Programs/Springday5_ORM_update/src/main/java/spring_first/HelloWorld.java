package spring_first;
import java.util.Iterator;
import org.hibernate.*;

public class HelloWorld {
	private SessionFactory sesfact;
	public void setSesfact(SessionFactory sesfact){
	this.sesfact = sesfact;
	}
	public Iterator getData(){
	Session ses=sesfact.openSession();
	Query query=ses.createQuery("select emp from Employee as emp");
	Iterator ii=query.iterate();
	return ii;
}
}