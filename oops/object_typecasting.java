class pre1{
	public void show() {
		print();
		System.out.println("exceuting method 1");
	}
	public void print() {
		System.out.println("exceuting method 2");
	}
}

public class object_typecasting {
	public static void main(String[] args) {
		pre1 obj=new pre1();
		obj.show();
	}

}
