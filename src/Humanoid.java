public interface Humanoid {
    public void levelUp();
    public void attack(Humanoid opponent);
    public void beAttack(double dmg);
    public double calDmg(Character1 Attacker);
    public double getHP();
    public double getMana();
}
