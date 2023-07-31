import java.util.Scanner;

public class Dice {
    private int theRoll;


    public void playGuessDiceValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please make your guess: ");
        int yourGuess = sc.nextInt();
        roll();
        if (yourGuess == theRoll) {
            System.out.println("YOU WON!");
        } else
            System.out.println("YOU ARE A LOSER!");

    }

    public void playTryToGuessAValueLowerThanTheSumOfNRolls(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please make your guess: ");
        int yourGuess = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("The " + i + " dice is: ");
            roll();
            sum += theRoll;
        }
        System.out.println("The sum of " + n + " dice rolls is: " + sum + "!");
        if (yourGuess <= sum) {
            System.out.println("YOU WON!");
        } else
            System.out.println("YOU ARE A LOSER!");

    }


    public void playRollDiceWithPC() {
        System.out.println("You rolled: ");
        int yourRoll = roll();
        System.out.println("The PC rolled: ");
        int pcRoll = roll();

        if (yourRoll > pcRoll) {
            System.out.println("YOU WON!");
        } else if (yourRoll < pcRoll) {
            System.out.println("PC WON!");
        } else
            System.out.println("IT'S A DRAW!");
    }

    private int roll() {
        theRoll = (int) (Math.random() * 6 + 1);

        switch (theRoll) {
            case 1:
                one();
                break;
            case 2:
                two();
                break;
            case 3:
                three();
                break;
            case 4:
                four();
                break;
            case 5:
                five();
                break;
            case 6:
                six();
                break;
        }
        return theRoll;
    }

    private void one() {
        System.out.println(" _____________ ");
        System.out.println("|             |");
        System.out.println("|      *      |");
        System.out.println("|             |");
        System.out.println("|_____________|");
        System.out.println();
    }

    private void two() {
        System.out.println(" _____________ ");
        System.out.println("|          *  |");
        System.out.println("|             |");
        System.out.println("|  *          |");
        System.out.println("|_____________|");
        System.out.println();
    }

    private void three() {
        System.out.println(" _____________ ");
        System.out.println("|          *  |");
        System.out.println("|      *      |");
        System.out.println("|  *          |");
        System.out.println("|_____________|");
        System.out.println();
    }

    private void four() {
        System.out.println(" _____________ ");
        System.out.println("|  *       *  |");
        System.out.println("|             |");
        System.out.println("|  *       *  |");
        System.out.println("|_____________|");
        System.out.println();
    }

    private void five() {
        System.out.println(" _____________ ");
        System.out.println("|  *       *  |");
        System.out.println("|      *      |");
        System.out.println("|  *       *  |");
        System.out.println("|_____________|");
        System.out.println();
    }

    private void six() {
        System.out.println(" _____________ ");
        System.out.println("|  *       *  |");
        System.out.println("|  *       *  |");
        System.out.println("|  *       *  |");
        System.out.println("|_____________|");
        System.out.println();
    }
}


