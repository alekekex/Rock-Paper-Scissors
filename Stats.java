public class Stats {
    private int gamesPlayed;
    private int wins;
    private int losses;
    private int currStreak;
    private int winStreaks;

    public Stats() {
        this.gamesPlayed = 0;
        this.wins = 0;
        this.losses = 0;
        this.currStreak = 0;
        this.winStreaks = 0;
    }

    public int getGamesPlayed() {
        return this.gamesPlayed;
    }

    public int getWins() {
        return this.wins;
    }

    public int getLosses() {
        return this.losses;
    }

    public int getWinStreaks() {
        return this.winStreaks;
    }

    public void addWins() {
        this.wins++;
        this.gamesPlayed++;
        this.currStreak++;

        if(this.currStreak == 2)
            this.winStreaks++;
    }

    public void addLosses() {
        this.losses++;
        this.gamesPlayed++;
        this.currStreak = 0;
    }
}
