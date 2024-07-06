package Codsoft_internship_projects.codsoft_tast_3;
import java.util.*;
public class ATM_interface {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter initial account balance: $");
        double initialBlance=sc.nextDouble();
        BankAccount bankAccount=new BankAccount(initialBlance);
        ATM atm=new ATM(bankAccount);
        while(true){
            atm.displayMenu();
            System.out.print("Select an option-> ");
            int choice=sc.nextInt();
            atm.performTranscation(choice,sc);
        }
    }
}
