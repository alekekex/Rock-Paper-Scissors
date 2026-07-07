public class Player {
    private String name;
    private boolean isAI;
    private Stats stats;

    public Player(String name, boolean isAI) {
        this.name = name;
        this.isAI = isAI;
        this.stats = new Stats();
    }

    public String getName() {
        return this.name;
    }

    public boolean isAI() {
        return this.isAI;
    }

    public Stats getStats() {
        return this.stats;
    }
}
