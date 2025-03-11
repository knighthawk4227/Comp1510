import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

class Games { 

private int score;
private Scanner scan;
private RandomGenerator rand;


public Games() {
    score = 0;
    scan = new Scanner(System.in);
    rand = RandomGenerator.getDefault();
    
}


public void play() {
    boolean y = true;
    while(y) {
    System.out.print(" Welcome to the Games program!\n" +
    " Make your choice (enter a number): \n" +
    " 1. See your score\n" +
    " 2. Guess a number\n" +
    " 3. Play Rock, Paper, Scissors\n" +
    " 4. Quit\n");
    System.out.print("Enter an Int: ");

    while (!scan.hasNextInt()) {
        System.out.print("That is an invalid entry, enter number from 1 - 4: ");
        scan.nextLine();
    }
    int n = scan.nextInt();
    switch(n){
        case(1) -> System.out.println("\nyour score is: " + score + "\n");
        case(2) -> guessANumber();
        case(3) -> rockPaperScissors();
        case(4) -> {System.out.println("bye"); return;}
    }
    scan.nextLine();
    
    }
}

public void guessANumber() {
    int n = rand.nextInt(0,101);
    int count = 0;
    boolean t = true;
    while (t) {
        System.out.print("Guess a number from 0 - 100: ");
    while (!scan.hasNextInt()) {
        System.out.print("That is not valid");
        scan.nextLine();
    }
    int guess = scan.nextInt();
    if (guess == n) {
    t = false;
    System.out.println("\nYOU GOT IT!!!\n ");
    if (count < 6) {
        score += 5;
    }
    return;
    }
    String result = guess < n ? "too Low try again":"Too High try again";
    System.out.println(result);
    count++;
    }
} 

    public void rockPaperScissors() {
        int n = rand.nextInt(0,3);
        boolean y = true;
        
        String[] rps = {"rock", "paper", "scissors"};
        String comp = rps[n];
        // while(y) {
        //     System.out.print("Please Rock, paper, or scissors: ");
        //     String input = scan.nextLine();
        //     if (input.equals("rock") || input.equals("paper") || input.equals("scissors")) {
        //         break;
        //     }
            System.out.println("invalid");
        }
            if(input.equals(rps[0])) {
                if (comp == rps[1]) {
                    System.out.println("you lose, -3 points will be taken");
                    score -= 3;
                }else if (comp == rps[2]) {
                    System.out.println("you win, +5 points for you");
                }else if (comp == rps[0]) {
                    System.out.println("It is  a draw, try again next time");
                }
            
            } else if (input.equals(rps[1])) {
                if (comp == rps[1]) {
                    System.out.println("Draw good one");
                }else if (comp == rps[2]) {
                    System.out.println("You Win!!!, I chose " + comp );
                    score += 5;
                }else if (comp == rps[0]) {
                    System.out.println("You Lose, I chose " + comp);
                }
            } else if (input.equals(rps[2])) {
                if (comp == rps[1]) {
                    System.out.println("you lose, -3 points will be taken");
                    score -= 3;
                }else if (comp == rps[0]) {
                    System.out.println("you win, +5 points for you");
                    score += 5;
                }else if (comp == rps[2]) {
                    System.out.println("It is  a draw, try again next time");
                }
            }
            return;
        }
    
}