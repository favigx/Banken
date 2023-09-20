import java.text.DecimalFormat;
import java.util.Scanner;

public class Bank {
    private double balance = 0;
    DecimalFormat dF = new DecimalFormat("0.##");
    double deposit;
    double withdrawal;

    public void showBalance(){
        System.out.println("Du har: " + dF.format(balance) + " kr");
    }
    
    public void depositMoney(Scanner input){ 
        System.out.println("Hur mycket vill du sätta in?");
        if(controlInt(input)){
            deposit = input.nextDouble();
            input.nextLine();
            balance += deposit;
            System.out.println("Du satte in " + deposit + " kr");
        }
        else{
            System.out.println("Du måste skriva en summa med siffror, försök igen!");
            input.nextLine();
        }
    }
    
    public void withdrawalMoney(Scanner input){
        System.out.println("Hur mycket vill du ta ut?");
        if(controlInt(input)){
            withdrawal = input.nextDouble();
            input.nextLine();  
            if (withdrawal <= balance){
            balance -= withdrawal;
            System.out.println("Du tog ut " + withdrawal + " kr");
            }
            else{
                System.out.println("Det finns inte tillräckligt med pengar på kontot, försök med en mindre summa!");
            }   
        }
        else{
            System.out.println("Du måste skriva en summa med siffror, försök igen!");
            input.nextLine();
        }  
    }

    public boolean exit(){
        System.out.println("Du har valt att avsluta tjänsten, tack för den här gången!");
        return false;
    }

    public void defaultMessage(){
        System.out.println("Du måste välja ett av menyvalen mellan siffra 1-4!");
    }

    public  boolean controlInt (Scanner input){
        if (input.hasNextDouble()){
            return true;
        }
        else{
            return false;
        }
    }
}