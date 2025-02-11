
class valA {
    void displayA() {
        System.out.println("Parent class of Hybrid inheritance ");
    }
}


class valB extends valA {
    void displayB() {
        System.out.println("child class A of Hybrid inheritance ");
    }
}


class valC extends valA {
    void displayC() {
        System.out.println("Cchild class C of Hybrid inheritance");
    }
}

class valD extends valA {
    void displayD() {
        System.out.println("child class D of Hybrid inheritance");
    }
}

class valE extends valB {
    void displayE() {
        System.out.println("child class E of Hybrid inheritance");
    }
}





public class hybrid {
    public static void main(String[] args) {
    valA obj1=new valA();
    obj1.displayA();
    System.out.println("----------");
    valB obj2=new valB();
    obj2.displayA();
    obj2.displayB();

    System.out.println("----------");

    valC obj3=new valC();
    obj3.displayA();
    obj3.displayC();

    System.out.println("----------");

    valD obj4=new valD();
    obj4.displayA();
    obj4.displayD();

    System.out.println("----------");

    valE obj5=new valE();
    obj5.displayA();
    obj5.displayB();
    obj5.displayE();


       
    }
}
