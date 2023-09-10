import java.util.*;

public class RockPaperScissors {
    Map<Integer, String> map = new HashMap<>();

    public RockPaperScissors() {
        map.put(0, "Rock");
        map.put(1, "Paper");
        map.put(2, "Scissors");
    }

    public String play() {
        Scanner sc = new Scanner(System.in);
        int userChoice = -1;

        while (userChoice < 0 || userChoice > 2) {
            System.out.println("Enter a choice (0 for Rock, 1 for Paper, 2 for Scissors):");
            try {
                userChoice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Not a valid choice!");
                sc.nextLine();
                userChoice = -1;
            }
        }

        Random rand = new Random();
        int computerChoice = rand.nextInt(3);

        System.out.println("You chose " + map.get(userChoice) + ".");
        System.out.println("Computer chose " + map.get(computerChoice) + ".");

        if ((userChoice == 0 && computerChoice == 2) || (userChoice == 1 && computerChoice == 0) ||
                (userChoice == 2 && computerChoice == 1)) {
            System.out.println("User wins!");
            return "user";
        } else if (userChoice == computerChoice) {
            System.out.println("It's a draw!");
            return "draw";
        } else {
            System.out.println("Computer wins!");
            return "computer";
        }
    }
}
