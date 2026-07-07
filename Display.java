public class Display {
    public static void displayMenu() {
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("[1] Play the game");
        System.out.println("[2] Show statistics");
        System.out.println("[2] Exit the program");
    }

    public static void displayStats(Player player, Player computer) {
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
    }

    public static void displayGameModes() {
        System.out.println("Choose a gamemode");
        System.out.println("[1] Best of 1 (BO1)");
        System.out.println("[2] Best of 3 (BO3)");
        System.out.println("[3] Best of 5 (BO5)");
    }

    public static void displayObject(int n) {
        switch(n) {
            case 1:
                System.out.println("""
                    _______
                ---'   ____)
                      (_____)
                      (_____)
                      (____)
                ---.__(___)
                """);
                break;
            case 2:
                System.out.println("""
                     _______
                ---'    ____)____
                           ______)
                          _______)
                         _______)
                ---.__________)
                """);
                break;
            case 3:
                System.out.println("""
                    _______
                ---'   ____)____
                          ______)
                       __________)
                      (____)
                ---.__(___)
                """);
                break;
        }
    }
}
