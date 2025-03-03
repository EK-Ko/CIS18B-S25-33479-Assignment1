import java.util.Scanner;

public class SimpleBankingSystem {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        System.out.println("Welcome to Simple Bank System");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money"); 
        System.out.println("3. Withdraw Money"); 
        System.out.println("4. Check Balance"); 
        System.out.println("5. Exit"); 

        System.out.println("Enter your choice: ");  
        int choice = scanner.nextInt();
        scanner.nextLine();

        

        while (choice != 1) { 
            if (choice == 5) {
            System.out.println("Thank you for using Simple Bank System!");
            scanner.close();
            return;
            }

            System.out.println("You need to create an account first");

            System.out.println("Enter your choice: ");  
            choice = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        System.out.print("Enter initial deposit: ");
        double initialDeposit = scanner.nextDouble();

        account = new BankAccount(name, initialDeposit);
        System.out.println("Account created successfully!");
        
        //

        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        System.out.println("Enter your choice: "); 
        choice = scanner.nextInt();
        scanner.nextLine();

        while (true) { 
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                }
                case 2 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                }
                case 3 -> System.out.println("Current Balance: $" + account.getBalance());
                case 4 -> {
                    System.out.println("Thank you for using Simple Bank System!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice! Please enter a number between 1-5.");
            }

            System.out.println("Enter your choice: "); 
            choice = scanner.nextInt();
            scanner.nextLine();
        }

        
    }

}
