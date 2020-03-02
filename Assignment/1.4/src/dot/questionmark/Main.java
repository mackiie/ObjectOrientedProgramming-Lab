package dot.questionmark;

import java.util.Scanner;

class Account
{
    private String customerName;
    int accountNumber;
    protected char type;
    protected int balance;

    Account()
    {
        customerName = "";
        balance = 0;
    }

    void input()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter customer name : ");
        customerName = s1.nextLine();
        System.out.print("Enter balance : ");
        balance = s1.nextInt();
    }

    void deposit()
    {
        int amount;
        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter amount to deposit : ");
        amount = s2.nextInt();
        balance += amount;
    }

    void display()
    {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Type : " + type);
        System.out.println("Balance : " + balance);
    }
}

class savingAccount extends Account
{
    private int interest;

    savingAccount()
    {
        type = 's';
        accountNumber++;
    }

    int compoundInterest()
    {
        int time,rate;
        rate = 10;
        Scanner s3 = new Scanner(System.in);
        System.out.print("Enter time : ");
        time = s3.nextInt();
        interest = (int) ((balance * (Math.pow(1 + rate / 100, time))) - balance);
        return interest;
    }

    void updateBalance()
    {
        balance += compoundInterest();
    }

    void withdrawal()
    {
        int amount;
        Scanner s4 = new Scanner(System.in);
        System.out.print("Enter amount to withdraw : ");
        amount = s4.nextInt();
        if (balance>amount)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("So much amount can't be withdrawn.");
        }
    }
}

class currentAccount extends Account
{
    private int chequeBook;
    private int penalty;

    currentAccount()
    {
        type = 'c';
        accountNumber += 1;
    }

    int minimumBalance()
    {
        int transactionPossible = 1;
        if (balance <= 500)
        {
            penalty = 200;
            balance = balance - penalty;
            transactionPossible = 0;
        }
        else
        {
            System.out.println("No penalty imposed");
        }
        return transactionPossible;
    }

    void withdrawal()
    {
        int amount;
        Scanner s5 = new Scanner(System.in);
        System.out.print("Enter amount to withdraw : ");
        amount = s5.nextInt();
        int transactionPossible = minimumBalance();
        if (transactionPossible == 1)
        {
            if (balance >= amount)
            {
                balance -= amount;
            }
        }
        else
        {
            System.out.println("So much amount can't be withdrawn.");
        }
    }
}

public class Main
{
    public static void main(String[] args)
    {
        currentAccount c1 = new currentAccount();
        savingAccount s1 = new savingAccount();
        c1.input();
        c1.display();
        c1.deposit();
        c1.display();
        c1.withdrawal();
        s1.input();
        s1.display();
        s1.withdrawal();
        s1.display();
    }
}
