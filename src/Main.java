import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
String accountPin[]={"0134","1530","7430","3890"};
        System.out.println("Please Enter your pin:");
        Scanner scanner =new Scanner(System.in);


        String input= scanner.nextLine();
        boolean isRight =false;

        for (String pins : accountPin) {
            if (input.equals(pins)) {
                isRight = true;
                break;
            }

        }
            if (isRight){
                System.out.println("please choose a transaction: " +
                        "1-Deposit " +
                        "2-Withdrawals " +
                        "3-Transfers ");
                Scanner sc =new Scanner(System.in);
                int reply = sc.nextInt();

                switch (reply){
                    case 1:
                        Deposits money =new Deposits();
                        money.deposit();
//                        System.out.println("how many would you like to deposit?");
                        break;

                    case 2:
                        System.out.println("how many would you like to deposit?");
                        break;
                    case 3:
                        System.out.println("What amount would you like to Transfer?");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }


            }
            else{
                System.out.println("Invalid pin! please enter pin again");
            }















    }
}