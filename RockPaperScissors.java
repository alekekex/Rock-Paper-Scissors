import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private final int MAX_PLAYERS = 2;
    private final int MIN_CHOICE = 1;
    private final int MAX_CHOICE = 3;
    private Player[] players;
    private int playerIdx;
    private int[] moves;
    private int[] scores;
    private int maxScore;
    private boolean isWinner;

    public RockPaperScissors(Player player, Player computer) {
        this.players = new Player[MAX_PLAYERS];
        this.players[0] = player;
        this.players[1] = computer;
        this.playerIdx = 0;
        this.moves = new int[MAX_PLAYERS];
        this.scores = new int[MAX_PLAYERS];
        this.maxScore = 0;
        this.isWinner = false;
    }

    public void playGame(Scanner scanner) {
        Display.displayGameModes();
        maxScore = getInput(scanner, MIN_CHOICE, MAX_CHOICE);

        while(!isWinner) {
            moves[0] = chooseMove(scanner);
            switchTurn();
            moves[1] = chooseMove(scanner);
            switchTurn();

            if(checkIfWon())
                isWinner = true;
        }
    }

    public static int getInput(Scanner scanner, int min, int max) {
        int choice = -1;
        boolean isValid = false;

        do {
            try {
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                if(!(choice >= min && choice <= max))
                    System.out.println("Invalid option. Please try again.");
                else isValid = true;
            } catch(InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        } while(!isValid);

        System.out.println();
        return choice;
    }

    public int chooseMove(Scanner scanner) {
        Random random = new Random();
        String name = players[playerIdx].getName();
        boolean isAI = players[playerIdx].isAI();
        int move = 0;

        if(isAI) {
            System.out.println(players[playerIdx].getName() + " is thinking...");

            try {
                Thread.sleep(1500);
            } catch(InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            move = random.nextInt(MAX_CHOICE) + 1;
        }
        else {
            System.out.println(name + ", what do you choose?");
            System.out.println("[1] Rock");
            System.out.println("[2] Paper");
            System.out.println("[3] Scissors");
            move = getInput(scanner, MIN_CHOICE, MAX_CHOICE);
        }

        System.out.print(name + " chooses ");
        switch(move) {
            case 1: System.out.println("rock!"); break;
            case 2: System.out.println("paper!"); break;
            case 3: System.out.println("scissors!"); break;
        }
        Display.displayObject(move);
        return move;
    }

    public void switchTurn() {
        playerIdx = 1 - playerIdx;
    }

    public boolean checkIfWon() {
        boolean hasWon = false;
        int n1 = moves[0];
        int n2 = moves[1];
        int winnerIdx = -1;
        int loserIdx = -1;

        if(n1 == n2)
            System.out.println("It's a tie! We go again...");
        else {
            if(n1 > n2 || (n1 == MIN_CHOICE && n2 == MAX_CHOICE)) {
                winnerIdx = 0;
                loserIdx = 1;
            }
            else if(n1 < n2 || (n1 == MAX_CHOICE && n2 == MIN_CHOICE)) {
                winnerIdx = 1;
                loserIdx = 0;
            }
            scores[winnerIdx]++;
            System.out.println(players[winnerIdx].getName() + " has won the round!");
        }

        System.out.println("Score: " + scores[0] + "-" + scores[1] + "\n");

        if(scores[0] == maxScore || scores[1] == maxScore) {
            hasWon = true;
            System.out.println(players[winnerIdx].getName() + " has won the game!\n");
            players[winnerIdx].getStats().addWins();
            players[loserIdx].getStats().addLosses();
        }

        return hasWon;
    }
}
