public class SwordMan extends Character1 implements Human{
   public SwordMan(String name){
        super(name);
   }
    @Override
    public void levelUp() {
        super.levelUp();
        intelligence = 100 + 10 * level; //ทำการเพิ่ม ค่าความฉลาดเพิ่มเข้าไปจาก  Constructor
        stamina += 100 +10 * level; // ทำการเพิ่มค่า stamina  เพิ่มเข้าไปจาก Constructor
    }

    /** เป็น method สำหรับการโจมตี ผู้เล่นอื่น
     * @param opponent คือผู้เล่นที่จะโจมตี
     * effects: ส่งดาเมจที่คำนวณไปให้ผู้ถูกโจมตี
     * effects: "No Sword in hande" จะพิมออกมาถ้าตัวละครไม่มีดาบ
     * */
    @Override
    public void attack(Humanoid opponent) {
        if (equippedSword != null){ // ต้องมีดาบถึงจะตีได้
            double dmg = calDmg(this);
            opponent.beAttack(dmg);
        }else{
            System.out.println("No Sword in hande");
        }
    }

    /** เป็น method สำหรับคำนวณดาเมทที่ผู้เล่นสามารถทำได้
     * @param Attcker คือผู้เล่นที่จะคำนวณดาเมทของการโจมตี
     * @return ค่าของดาเมทที่ผู้เล่นนั้นทำได้
     * */

    @Override
    public double calDmg(Character1 Attcker) {
       int random = (int)(Math.random() * 5) + 1;
        double dmg = Attcker.equippedSword.getDamage();
        if(random == 1 || random == 5) dmg *= 2 ;
        if (equippedShield != null){
            if (dmg - this.equippedShield.getDefense() > 0){
                dmg -= this.equippedShield.getDefense();
                return dmg ;
            }else {
                return 0;
            }
        }else {
            if(dmg >= hp){
                return hp ;
            }else{
                return dmg;
            }
        }

    }


}
