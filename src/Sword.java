public class Sword  {


    private double baseDamage;
    private double damage;
    private int level;

    public Sword() {
        this.baseDamage = 100;
        this.level = 1;
        updateDamage();
    }
    /** เป็น method เพิ่ม level และ เพิ่มค่าโจมตีของดาบ
     * effects: ทำการเพิ่ม level ของดาบ
     * effects: เพิ่มพลังโจมตีของดาบ
     */
    public void levelUp() {
        level++;
        updateDamage();
    }



    /** เป็น method เพิ่มพลังโจมตีของดาบ
     * effects: เพิ่มพลังโจมตีของดาบ
     */
    private void updateDamage() {
        damage = baseDamage * (1 + 0.1 * level);
    }



    /** เป็น method ที่ทำการคืนค่า level ของดาบ
     * @return ให้ level ของดาบ
     */
    public int getLevel() {
        return level;
    }


    /** เป็น method ที่ทำการคืนค่าพลังโจมตีของดาบ
     * @return ให้ พลังโจมตีของดาบ
     */
    public double getDamage() {
        return damage;
    }

}
