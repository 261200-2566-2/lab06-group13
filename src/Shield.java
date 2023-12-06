public class Shield {
    private double baseDefense;
    private double defense;
    private int level;


    /**
     * เป็น method ที่ทำการ set ค่าเริ่มต้นของ โล่ */
    public Shield() {
        this.baseDefense = 100;
        this.level = 1;
        updateDefense();
    }

    /** เป็น method เพิ่ม level และ เพิ่มค่าป้องกันของโล่
     * effects: ทำการเพิ่ม level ของโล่
     * effects: เพิ่มพลังป้องกันของโล่
     */
    public void levelUp() {
        level++;
        updateDefense();
    }


    /** เป็น method เพิ่มพลังป้องกันของโล่
     * effects: เพิ่มพลังป้องกันของโล่
     */
    private void updateDefense() {
        defense = baseDefense * (1 + 0.05 * level);
    }


    /** เป็น method ที่ทำการคืนค่า level ของโล่
     * @return ให้ level ของโล่
     */
    public int getLevel() {
        return level;
    }


    /** เป็น method ที่ทำการคืนค่า defense ของโล่
     * @return ให้ defense ของโล่
     */
    public double getDefense() {
        return defense;
    }

}
