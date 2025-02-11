public class elif {
    public static void main(String[] args) {
        int age=42;
        if(age<18){
            System.out.println("Your minor");
        }
        else if((age>18)&&(age<60)){
            System.out.println("Your Major");
        }
        else{
            System.out.println("Your Senior Citizen");
        }
    }
}