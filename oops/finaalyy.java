
public class finaalyy {
	
// with exception 
public static void main(String[] args) {
		int a[] =new int[3];
		try {
		a[0] =50;
		System.out.println(a[2]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("please provide values");
			
		}
		finally {
			System.out.println("exceuting finally values");
		}
		
	}
	
}
