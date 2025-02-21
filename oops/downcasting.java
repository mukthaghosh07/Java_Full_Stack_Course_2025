class d1{
	public void print() {
		System.out.println("class 1 diaplay method");
	}
	
}
class d2 extends d1{
	public void print1() {
		System.out.println("class 2 diaplay2 method");
	}
	
	
}
public class downcasting {
	public static void main(String[] args) {
		d1 obj=(d1)new d2();
		d2 obj1=(d2) obj;
		
		obj1.print();
		obj1.print1();
		
		
	}
	}

