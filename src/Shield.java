public class Shield {
    private double baseDefense;
    private double defense;
    private int level;

    public Shield() {
        this.baseDefense = 100;
        this.level = 1;
        updateDefense();
    }

    public void levelUp() {
        level++;
        updateDefense();
    }

    private void updateDefense() {
        defense = baseDefense * (1 + 0.05 * level);
    }

    public int getLevel() {
        return level;
    }

    public double getDefense() {
        return defense;
    }

}
