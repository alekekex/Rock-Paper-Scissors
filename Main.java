import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        Player player = new Player("Player", false);
        Player computer = new Player("AI", true);

        while(isRunning) {
            Display.displayMenu();
            int choice = RockPaperScissors.getInput(scanner, 1, 3);

            switch(choice) {
                case 1:
                    RockPaperScissors game = new RockPaperScissors(player, computer);
                    game.playGame(scanner);
                    break;
                case 2:
                    Display.displayStats(player, computer);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}
