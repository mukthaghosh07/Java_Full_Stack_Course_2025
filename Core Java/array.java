public class array {
    public static void main(String[] args) {

        System.out.println("INTEGER");
        int ip[]=new int[5];
        ip[0]=12;
        ip[1]=14;
        ip[2]=56;
        ip[3]=78;
        ip[4]=101;

        System.out.println("["+ ip[0]+"\t" +ip[1] +"\t" +ip[2]+"\t"+ip[3]+"\t"+ip[4]+"]");
        System.out.println();

        System.out.println("FLOAT");
        float ip2[]=new float[2];
        ip2[0]=34;
        ip2[1]=45;
        System.out.println("["+ip2[0]+"\t"+ip2[1] +"]");
        System.out.println();

        System.out.println("BOOLEAN");
        boolean ip3[]=new boolean[2];
        ip3[0]=true;
        ip3[1]=false;
        System.out.println("["+ip3[0]+"\t"+ip3[1] +"]");
        System.out.println();
        
        System.out.println("STRING");
        String ip4[]=new String[3];
        ip4[0]="Muktha";
        ip4[1]="Ghosh";
        ip4[2]="Java";
        System.out.println("["+ip4[0]+"\t"+ip4[1] + "\t"+ ip4[2]+"]");
        System.out.println();


        System.out.println("CHAR ");
        char ip5[]=new char[2];
        ip5[0]='w';
        ip5[1]='d';
        System.out.println("["+ip5[0]+"\t"+ip5[1] +"]");

    }
}
