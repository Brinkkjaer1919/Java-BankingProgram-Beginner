import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        double balance = 0;
        boolean isRunning = true;

        System.out.println("BANKING SYSTEM IS RUNNING");
        System.out.println("*************************");

        while (isRunning) {
            System.out.println("1. Display Balance");
            System.out.println("2. Insert");
            System.out.println("3. Withdraw");
            System.out.println("4. Log out");
            System.out.println("*************************");
            System.out.print("Enter your choise (1-4): ");


            switch (scanner.nextInt()) {
                case 1 -> displayBalance(balance);
                case 2 -> balance += insert();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = closeProgram();
            }
        }

        scanner.close();
        // display closeing message
    }

    public static void displayBalance(double balance) {
        System.out.println("your balance is: " + balance);
        System.out.println("************");
    }
    public static double insert() {
        System.out.print("Type amount you wish to deposit: ");
        double depositAmount = scanner.nextDouble();

        if (depositAmount <= 0) {
            System.out.println("Amount has to be greater than 0");
            System.out.println("**********************************");
            return 0;
        } else {
            System.out.println("you deposited: " + depositAmount);
            System.out.println("**********************************");
            return depositAmount;
        }
    }
    public static double withdraw(double balance){
        System.out.print("Type the amount you wish to withdraw: ");
        double withdrawAmount = scanner.nextDouble();

        if (withdrawAmount > balance) {
            System.out.println("Amount can not be greater than current balance");
            System.out.println("*************************");
            return 0;
        } else if (withdrawAmount <= 0){
            System.out.println("Error, amount must be possitiv");
            System.out.println("*************************");
            return 0;
        } else {
            System.out.println("you have withdrawn: " + withdrawAmount);
            System.out.println("*************************");
            return withdrawAmount;
        }
    }
    public static boolean closeProgram(){
        System.out.println("Thank you for using our banking program, have a nice day ^_^");
        return false;
    }
}




// Test