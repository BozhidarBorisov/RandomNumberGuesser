package Projects;

import java.util.Scanner;

public class RandomNumberGuesser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max =100;
        int min=1;
        int range = max-min+1;
        int num = (int)(Math.random()*range)+min;
        int number = Integer.parseInt(scanner.nextLine());
        while(number!=num){
            if(number<num){
                System.out.println("Higher");
            }
            else{
                System.out.println("Lower");
            }
            number = scanner.nextInt();
        }
        System.out.println("**********");
        System.out.println("Congratulations, you guessed the number!");
        System.out.println("**********");
    }
}

