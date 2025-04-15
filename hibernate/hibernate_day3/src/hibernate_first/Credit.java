package hibernate_first;

public class Credit {
	private String Ename;
    private int accnum;
    private int amount;
    
    public String getEname() {
    return Ename;
    }
    public void setEname(String Ename) {
    	this.Ename = Ename;
    	
    }
  
    public int getAccnum() {
        return accnum;
    }

    public void setAccnum(int accnum) {
        this.accnum = accnum;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
