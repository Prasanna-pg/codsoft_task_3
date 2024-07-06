package Codsoft_internship_projects.codsoft_tast_3;
import java.util.*;
public class ATM {
    private BankAccount bankAccount;
    public ATM(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }
    public void displayMenu(){
        System.out.println("ATM Menu...");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
    }
    public void performTranscation(int choice,Scanner sc){
        switch (choice){
            case 1:
                System.out.println("Current Balance: $"+bankAccount.getBalance());
                break;
            case 2:
                System.out.print("Enter deposit amount: $");
                double depositAmount=sc.nextDouble();
                bankAccount.deposit(depositAmount);
                break;
            case 3:
                System.out.print("Enter withdrawal amount: $");
                double withdrwawalAmount=sc.nextDouble();
                bankAccount.withDraw(withdrwawalAmount);
                break;
            case 4:
                System.out.print("Exiting ATM...Thank You...!");
                sc.close();
                System.exit(0);
            default:
                System.out.print("Invalid choice. Please select a valid option...");
        }
    }
}
