import java.util.Scanner;
// Custom Exception Class
class InvalidInputException extends Exception {
    public InvalidInputException(String mesg) {
        super(mesg);
    }
}
// User is the parent class
class User {
    protected String mobileNumber;

    public User(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
// Recharge Module
class mr extends User {
    public mr(String mobileNumber) {
        super(mobileNumber);
    }
    public void recharge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Packages:");
        System.out.println("1. Amount: 200 | Validity: 30 days | Data: 3GB/day");
        System.out.println("2. Amount: 300 | Validity: 30 days | Data: 6GB/day");
        System.out.println("3. Amount: 450 | Validity: 42 days | Data: 2GB/day");
        System.out.println("4. Amount: 565 | Validity: 90 days | Data: 1.5GB/day");
        System.out.println("5. Amount: 876 | Validity: 110 days | Data: 2GB/day");
        System.out.print("Enter the appropriate package number to proceed further: ");
        int choice = scanner.nextInt();
        if (choice >= 1 && choice <= 5) {
            processPayment();
            System.out.println("Congratulations! Your recharge is successful.");
        } else {
            System.out.println("Invalid package ....Please select the correct package");
        }
    }
    void processPayment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter debit/credit card number: ");
        String cardNumber = scanner.next();
        System.out.print("Enter Expiry date (MM/YY): ");
        String expiryDate = scanner.next();
        System.out.print("Enter CVV number (XXX): ");
        String cvv = scanner.next();
        System.out.println("Processing payment...");
    }
}

// Bill Payment Module
class BillPayment extends User {
    public BillPayment(String mobileNumber) {
        super(mobileNumber);
    }

    public void payBill() {
        System.out.println("Bill due amount is 600 INR");
        new mr(mobileNumber).processPayment();
        System.out.println("Congratulations! Your bill amount is paid successfully.");
    }
}

// Conversion Module
class Conversion extends User {
    public Conversion(String mobileNumber) {
        super(mobileNumber);
    }

    public void convert(int option) {
        if (option == 6) {
            System.out.println("Converting Prepaid to Postpaid...");
        } else if (option == 7) {
            System.out.println("Converting Postpaid to Prepaid...");
        } else {
            System.out.println("Invalid option.....Please select the correct option");
            return;
        }
        System.out.println("Congrats! Your request is received. Your new SIM will be delivered within 2 days.");
    }
}

// Balance Module
class Balance extends User {
    public Balance(String mobileNumber) {
        super(mobileNumber);
    }

    public void showBalance() {
        System.out.println("Balance:");
        System.out.println("SMS: 30");
        System.out.println("Talktime: Unlimited");
        System.out.println("Data: 1GB");
    }
}

// Profile Details Module
class Profile extends User {
    public Profile(String mobileNumber) {
        super(mobileNumber);
    }

    public void showProfile() {
        System.out.println("Account name : Muktha");
        System.out.println("Address: Suchitra, Hyderabad, Telangana");
    }
}

// with the help of do let us pick the options after that we will use switch case 

public class miniproject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("\nWelcome to Mytel:");
            System.out.println("1. Mobile Recharge");
            System.out.println("2. Pay Bills");
            System.out.println("3. Convert Prepaid/Postpaid");
            System.out.println("4. Know Balance");
            System.out.println("5. Profile Details");
            System.out.println("0. Exit");
            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            if (option < 0 || option > 5) {
                System.out.println("Wrong option. Please enter a valid number.");
                continue;
            }
            if (option == 0) {
                break;
            }
            System.out.print("Enter your phone number: ");
            String mobileNumber = scanner.next();
            switch (option) {
                case 1:
                    new mr(mobileNumber).recharge();
                    break;
                case 2:
                    new BillPayment(mobileNumber).payBill();
                    break;
                case 3:
                    System.out.println("6. Convert Prepaid to Postpaid");
                    System.out.println("7. Convert Postpaid to Prepaid");
                    System.out.print("Enter your choice: ");
                    int convOption = scanner.nextInt();
                    new Conversion(mobileNumber).convert(convOption);
                    break;
                case 4:
                    new Balance(mobileNumber).showBalance();
                    break;
                case 5:
                    new Profile(mobileNumber).showProfile();
                    break;
            }
// last mein asking whether want to continue more or exit ?
            System.out.println("\nPress 1 to continue or Press 0 to exit: ");
        } while (scanner.nextInt() == 1);
        System.out.println("*************Thank you for using Mytel!***************** \n visit again ....");
        scanner.close();
    }
}
