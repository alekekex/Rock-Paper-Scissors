public class Stats {
    private int roundsPlayed;
    private int wins;
    private int losses;
    private int currStreak;
    private int winStreaks;

    public Stats() {
        this.roundsPlayed = 0;
        this.wins = 0;
        this.losses = 0;
        this.currStreak = 0;
        this.winStreaks = 0;
    }

    public int getRoundsPlayed() {
        return this.roundsPlayed;
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
        this.roundsPlayed++;
        this.currStreak++;

        if(this.currStreak == 2)
            this.winStreaks++;//TEST
    }

    public void addLosses() {
        this.losses++;
        this.roundsPlayed++;
        this.currStreak = 0;
    }
}
