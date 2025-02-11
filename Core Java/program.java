class tables {
    public void print(int n) {
        for (int i = 1; i <= 10; i++) { 
            int res = n * i;
            System.out.println(n +"*" +i +"="+res);
        }
    }
}

public class program {
    public static void main(String[] args) { 
        tables obj = new tables(); 
        obj.print(3);
    }
}
