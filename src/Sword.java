public class Sword  {


    private double baseDamage;
    private double damage;
    private int level;

    public Sword() {
        this.baseDamage = 100;
        this.level = 1;
        updateDamage();
    }

    public void levelUp() {
        level++;
        updateDamage();
    }

    private void updateDamage() {
        damage = baseDamage * (1 + 0.1 * level);
    }

    public int getLevel() {
        return level;
    }

    public double getDamage() {
        return damage;
    }

}
