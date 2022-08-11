import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {
//        Prompt user to guess a number
        System.out.println("Are you feeling lucky? Take a chance guessing the secret number...");

//        Collect user input
        Scanner reader = new Scanner(System.in);
        String secretNumber = reader.nextLine();

//        if chocolate is 3, print 'correct'
//        otherwise print 'incorrect'

        if (secretNumber.equals("3")){
            System.out.println("That's correct!!");
        } else {
            System.out.println("Wrong! Now leave.");
        }

    }

}
