public class Player {
    private String name;
    private boolean isAI;
    private int score;
    private Stats stats;

    public Player(String name, boolean isAI) {
        this.name = name;
        this.isAI = isAI;
        this.score = 0;
        this.stats = new Stats();
    }

    public String getName() {
        return this.name;
    }

    public boolean isAI() {
        return this.isAI;
    }

    public int getScore() {
        return this.score;
    }

    public Stats getStats() {
        return this.stats;
    }

    public void addScore() {
        this.score++;
    }
}
