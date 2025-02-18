// class pre111{
//     int aa=10;
//     public void display(){
//         System.out.println("parent class constructor");
//     }
// }

// // with the help of inheritance let us solve this
// class pre02 extends pre111{
//     public void print(){
       
//         System.out.println(super.aa);
//         super.display();
//         System.out.println("displaying the super class using child class method");
//     }
// }
// public class super_key_const {
//     public static void main(String[] args) {
//         pre02 obj=new pre02();
//         obj.print();
       
//     }
    
// }



//------------ Calling the constructor class----------------//

class pre111 {
    int aa = 10;

    public pre111() {
        System.out.println("parent class constructor");
    }

    public void display() {
        System.out.println("parent class display method");
    }
}

class pre2 extends pre111 {
    public pre2() {
        super();  // Calls the parent class constructor explicitly
    }

    public void print() {
        System.out.println("displaying the super class using child class method");
        System.out.println(super.aa);
        super.display();
    }
}

public class super_key_const {
    public static void main(String[] args) {
        pre2 obj = new pre2();
        obj.print();
    }
}

