import java.util.Scanner;

public class App {
     
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        Bank bank = new Bank();

        while (run){
            System.out.println("Välj ett av de fyra alternativ presenterade nedan:");
            System.out.println("[1] Se saldo");
            System.out.println("[2] Sätt in pengar");
            System.out.println("[3] Ta ut pengar");
            System.out.println("[4] Avsluta");
            String menyChoice = input.nextLine();
        
            switch(menyChoice){
                case "1":
                    bank.showBalance();
                    break;

                case "2":
                    bank.depositMoney(input);
                    break;

                case "3":
                    bank.withdrawalMoney(input);
                    break;

                case "4":
                    run = bank.exit();
                    break;

                default:
                    bank.defaultMessage();
                    break;
            } 
        }
        input.close();
    }  
}
