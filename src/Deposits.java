import java.util.Scanner;

public class Deposits {
    public void deposit() {
        System.out.println("what amount would you like to deposit?");
        Scanner scan = new Scanner(System.in);

        int amt = scan.nextInt();
        if (amt > 0 && amt < 100) {
            System.out.println("you have chosen to deposit " + amt +"cedis. Press 1 to confirm or 2 to terminate");

            Scanner response = new Scanner(System.in);
            int answer = response.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("Account updated sucessfully");
                    break;

                case 2:
                    System.out.println("Process terminated");
                    break;
                default:
                    System.out.println("Invalid Response!");
            }

        }
        else{
            System.out.println("invalid number! amount should be between 0 and 100");
        }
        scan.close();
    }

}

