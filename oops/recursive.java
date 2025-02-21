
class pre2{
	int i=0;
	public void show() {
		while(i<10) {
			System.out.println("finally execution " +i);
			i++;
			show();
		}
	}
}
public class recursive {
	public static void main(String[] args) {
		pre2 obj=new pre2();
		obj.show();
		
	}

}
