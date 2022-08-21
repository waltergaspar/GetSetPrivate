package Principal;

import Engine.AccountControl;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        AccountControl accountControl;
        String holderName;
        double balance, draw;
        int accountNumber;
        char deposit;


        System.out.print("Enter account number: ");
        accountNumber = scanner.nextInt();

        System.out.print("Enter account holder: ");
        scanner.nextLine();
        holderName = scanner.nextLine();

        System.out.print("Is there a initial deposit (y/n)? ");
        deposit = scanner.next().charAt(0);

        if (deposit == 'y'){
            System.out.print("Enter initial deposit value: ");
            balance = scanner.nextDouble();
            accountControl = new AccountControl(accountNumber, holderName, balance);
        } else{
            accountControl = new AccountControl(accountNumber, holderName);
        }

        System.out.println("\n" + accountControl + "\n");

        System.out.print("Enter a deposit value: ");
        balance = scanner.nextDouble();
        accountControl.deposit(balance);

        System.out.println(accountControl + "\n");

        System.out.print("Enter a withdraw value: ");
        draw = scanner.nextDouble();
        accountControl.draw(draw);

        System.out.println(accountControl + "\n");
    }
}
