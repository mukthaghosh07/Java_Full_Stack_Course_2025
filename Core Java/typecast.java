public class typecast {
    public static void main(String[] args) {
       //program 1
       int num=122;
       double sol=num;
       long l=num;
       float f=l;
       System.out.println(sol);
       System.out.println(l);
       System.out.println(f);


        //program 2
        System.out.println("--------------");
        System.out.println("Program 2");
        System.out.println("--------------");

        double n1=22.3;
        int sol2 =(int) n1;
        System.out.println(sol2);

        //program 3
        System.out.println("--------------");
        System.out.println("Program 3");
        System.out.println("--------------");
        //incompatiable data type
        double n3=65.6;
        char ch=(char) n3;
        System.out.println(ch);



       


      

    }
}