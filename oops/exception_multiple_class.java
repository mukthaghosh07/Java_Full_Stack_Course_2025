
public class exception_multiple_class {
public static void main(String[] args) {
	try {
		float v1=989.6f;
		float v2;
		System.out.println(args[0]);
		float res=v1/0;
		System.out.println(res);
		
	}
	catch (ArrayIndexOutOfBoundsException ep) {
		System.out.println("this is throws ArrayIndexOutOfBoundsException exception");
		
	}
	catch (ArithmeticException e) {
		System.out.println("this is throws arthimetic exception");
	}
		
	}

}
