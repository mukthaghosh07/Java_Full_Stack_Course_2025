class meth{
	int value1=100;
	void change(meth m2) {
		m2.value1++;
		
	}
}
public class callbyreference {
public static void main(String[] args) {
		meth mm=new meth();
		System.out.println("before update: " +mm.value1);
		mm.change(mm);
		System.out.println("after update: " +mm.value1);
	}


}
