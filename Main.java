import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        Player player = new Player("Player", false);
        Player computer = new Player("AI", true);

        while(isRunning) {
            Display.displayMenu();
            int choice = 0;
            boolean isValid = false;

            do {
                try {
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();
                    scanner.nextLine();

                    if(!(choice >= 1 && choice <= 3))
                        System.out.println("Invalid option. Please try again.");
                    else {
                        isValid = true;
                        System.out.println();
                    }
                } catch(InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine();
                }
            } while(!isValid);

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
