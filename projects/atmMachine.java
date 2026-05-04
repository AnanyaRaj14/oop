import java.util.*;

class ATM{
    float Balance;
    int PIN = 1125;

    public void checkpin(){
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int enteredPIN = sc.nextInt();

        if(enteredPIN != PIN) System.out.println("Wrong pin, please enter a valid pin");
        else{
            menu();
        }
    }

    public void menu(){
        System.out.println("Enter your choice : ");
        System.out.println("1 : check balance");
        System.out.println("2 : Withdraw money");
        System.out.println("3 : Deposite Money ");
        System.out.println("4 : Exit ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if(option == 1){
            checkBalance();
        }
        else if(option == 2){
            withdrawMoney();
        }
        else if(option == 3){
            depositeMoney();
        }
        else if(option == 4){
            return;
        }
        else{
            System.out.println("Enter a valid option");
        }
    }

    public void checkBalance(){
        System.out.println("Available balance is : " + Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter money to withdraw : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextInt();
        if(amount > Balance){
            System.out.println("Insufficient Amount");
        }else{
            Balance -= amount;
            System.out.println("Money withdrawl successful");
        }
        menu();
    }

    public void depositeMoney(){
        System.out.print("Enter amount o be deposite : ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        Balance += amount;
        System.out.println("Money is deposited successfully");
        menu();
    }


}


public class atmMachine{
    public static void main(String[] args){
        ATM obj = new ATM();
        obj.checkpin();
    }
}