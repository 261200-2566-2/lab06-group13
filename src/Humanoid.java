public interface Humanoid {
    /** เป็น method เพิ่ม level เเละค่าต่างๆ
     */
    public void levelUp();

    /** เป็น method สำหรับการโจมตี ผู้เล่นอีกคนหนึ่ง
     * */
    public void attack(Humanoid opponent);


    /** เป็น method ที่ทำการรับการโจมตี
     * */
    public void beAttack(double dmg);

    /** เป็น method สำหรับคำนวณดาเมทที่ผู้เล่นสามารถทำได้
     * */
    public double calDmg(Character1 Attacker);

    /** เป็น method ที่ทำการคืนค่า HP ปัจจุบันออกมาก
     */
    public double getHP();


    /** เป็น method ที่ทำการคืนค่า Mana ปัจจุบันของตัวละคร
     */
    public double getMana();
}
