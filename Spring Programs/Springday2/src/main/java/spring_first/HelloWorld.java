package spring_first;

public class HelloWorld {
private String message;
private String name;

/*public  HelloWorld2(String name) {
	this.name=name;
} */

public HelloWorld(String message, String name) {
	this.message=message;
	this.name=name;
}
public void getMessage(){
System.out.println(message);
}
public void getMessage1(){
System.out.println(name);
}
}