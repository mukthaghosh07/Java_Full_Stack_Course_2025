package spring_first;

public class File_auto1 {
	File_auto2 one;
	public void setOne(File_auto2 one){
	this.one=one;
	}
	public String displayMessage(){
	return one.mymessage();
	}
}
