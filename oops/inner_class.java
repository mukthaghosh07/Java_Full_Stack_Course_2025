
class pre3{
	int aa=50;
	public void demo() {
		System.out.println("outer class: " +aa);
	}
	class pre4{
		float bb=98.3f;
		public void display() {
			System.out.println("inner class: " +bb);
			demo();
		}
		
	}
}
public class inner_class {
	public static void main(String[] args) {
		pre3 obj=new pre3();
		pre3.pre4 obj2= obj.new pre4();
		obj2.display();
		
	}

}
