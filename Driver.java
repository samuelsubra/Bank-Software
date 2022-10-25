import java.util.Scanner;
public class Driver
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Checking myChecking = new Checking(0.0f);
        Savings mySavings = new Savings(0.0f);
        int choice;
        float userAnswer = 0.0f;
        do
        {
            System.out.println("1. Withdraw from Checking");
            System.out.println("2. Withdraw from Savings");
            System.out.println("3. Deposit to Checking");
            System.out.println("4. Deposit to Savings");
            System.out.println("5. Balance of Checking");
            System.out.println("6. Balance of Savings");
            System.out.println("7. Award Interest to Savings now");
            System.out.println("8. Quit");
            choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("How much would you like to withdraw from Checking?");
                    userAnswer = scan.nextFloat();
                    myChecking.withdraw(userAnswer);
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw from Savings?");
                    userAnswer = scan.nextFloat();
                    mySavings.withdraw(userAnswer);
                    break;
                case 3:
                    System.out.println("How much would you like to deposit into Checking?");
                    userAnswer = scan.nextFloat();
                    myChecking.deposit(userAnswer);
                    System.out.println("Doing default deposit");
                    break;
                case 4:
                    System.out.println("How much would you like to deposit into Savings?");
                    userAnswer = scan.nextFloat();
                    mySavings.deposit(userAnswer);
                    break;
                case 5:
                    System.out.println("Your balance for checking " + myChecking.getAccount_number() + " is " + myChecking.getAccount_balance());
                    break;
                case 6:
                    System.out.println("Your balance for savings " + mySavings.getAccount_number() + " is " + mySavings.getAccount_balance());
                    break;
                case 7:
                    System.out.println("Customer earned " + mySavings.interest() + " in interest");
                    break;
                case 8:
                    break;
            }
        } while (choice != 8);
    }
}
