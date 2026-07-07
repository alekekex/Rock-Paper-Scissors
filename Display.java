public class Display {
    public static void displayMenu() {
        String divider = "-----------------------------------";
        System.out.println(divider);
        System.out.println("        ROCK PAPER SCISSORS        ");
        System.out.println(divider);
        System.out.println("1 - Play the game");
        System.out.println("2 - Show statistics");
        System.out.println("3 - Exit the program");
        System.out.println(divider);
    }

    public static void displayStats(Player player, Player computer) {
        String divider = "---------------------------------";
        System.out.println(divider);
        System.out.println("        PLAYER STATISTICS        ");
        System.out.println(divider);
        System.out.println(player.getName() + ":");
        System.out.println("Games Played - " + player.getStats().getGamesPlayed());
        System.out.println("Wins - " + player.getStats().getWins());
        System.out.println("Losses - " + player.getStats().getLosses());
        System.out.println("Win Streaks - " + player.getStats().getWinStreaks());
        System.out.println();
        System.out.println(computer.getName() + ":");
        System.out.println("Games Played - " + computer.getStats().getGamesPlayed());
        System.out.println("Wins - " + computer.getStats().getWins());
        System.out.println("Losses - " + computer.getStats().getLosses());
        System.out.println("Win Streaks - " + computer.getStats().getWinStreaks());
        System.out.println(divider);
        System.out.println();
    }

    public static void displayGameModes() {
        String divider = "----------------------------";
        System.out.println(divider);
        System.out.println("          GAMEMODE          ");
        System.out.println(divider);
        System.out.println("1 - Best 1 of 1 (BO1)");
        System.out.println("2 - Best 2 of 3 (BO3)");
        System.out.println("3 - Best 3 of 5 (BO5)");
        System.out.println(divider);
    }

    public static void displayMoveChoices(String name) {
        String divider = "-------------------------------";
        System.out.println(divider);
        System.out.println("        " + name.toUpperCase() + "'S CHOICE ");
        System.out.println(divider);
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        System.out.println(divider);
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
