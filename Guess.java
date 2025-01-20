import java.util.*;
class Lab_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int secretNum = rand.nextInt(11);
        int guessNum = 0;
        int guess = 0;
        while (guess != secretNum){
            System.out.println("Enter your guess: ");
            guessNum += 1;
            guess = Integer.parseInt(scan.nextLine());
            if (guess<secretNum){
                System.out.println("Your guess is too low.");
                }
            else if (guess>secretNum){
                System.out.println("Your guess is too high.");
            }
            else {
                System.out.println("You got it in " + guessNum + " guesses!");
            }


        }
    }
}

