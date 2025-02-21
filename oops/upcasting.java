class up1{
	public void display() {
		System.out.println("class 1 diaplay method");
	}
	
}
class up2 extends up1{
	public void display1() {
		System.out.println("class 2 diaplay2 method");
	}
	
	
}
public class upcasting {
	public static void main(String[] args) {
		up1 obj=(up1)new up2();
		obj.display();
		
	}
	}


