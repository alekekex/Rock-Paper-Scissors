import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        Player player = new Player("Player", false);
        Player computer = new Player("AI", true);

        while(isRunning) {
            System.out.println("Welcome to Rock Paper Scissors!");
            System.out.println("[1] Play the game");
            System.out.println("[2] Show statistics");
            System.out.println("[2] Exit the program");
            int choice = RockPaperScissors.getInput(scanner, 1, 3);

            switch(choice) {
                case 1:
                    RockPaperScissors game = new RockPaperScissors(player, computer);
                    game.playGame(scanner);
                    break;
                case 2:
                    System.out.println("Player Statistics:");
                    System.out.println("[1] " + player.getName() + ": Rounds Played - " +
                            player.getStats().getRoundsPlayed() + ", Wins - " +
                            player.getStats().getWins() + ", Losses - " +
                            player.getStats().getLosses() + ", Win Streaks - " +
                            player.getStats().getWinStreaks());
                    System.out.println("[2] " + computer.getName() + ": Rounds Played - " +
                            computer.getStats().getRoundsPlayed() + ", Wins - " +
                            computer.getStats().getWins() + ", Losses - " +
                            computer.getStats().getLosses() + ", Win Streaks - " +
                            computer.getStats().getWinStreaks());
                    System.out.println();
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
