public class assignment1 {
    public static void main(String[] args) {
        int age=60;
        int cost=300;
        if(age<=5){
            System.out.println("Your child, No ticket");
        }
        else if(age>5 && age<12){
            System.out.println("your Minor. Ticket cost: "+cost/2);
        }
        else if (age >= 12 && age < 60) {
            System.out.println("You are major. Ticket cost: " + cost);
    }
        else if (age >= 60) {
        System.out.println("You are  senior citizen. Ticket cost:" + cost*0.8);
        }
}
}
