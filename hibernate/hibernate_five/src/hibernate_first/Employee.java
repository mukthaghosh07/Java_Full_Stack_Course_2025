package hibernate_first;
import javax.persistence.*;
@Entity
@Table(name = "myemployee")
public class Employee { 
@Id
@Column(name = "id")
private int eid; 
@Column(name = "name")
private String ename; 
public int getEid() { 
 return eid; 
} 
public void setEid(int eid) { 
 this.eid = eid; 
} 
public String getEname() { 
 return ename; 
} 
public void setEname(String ename) { 
 this.ename = ename; 
} 
}