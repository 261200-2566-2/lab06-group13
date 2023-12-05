public class Berserk extends Character1 implements Human{
    Berserk(String name){
        super(name);
    }

    /** เป็น method สำหรับการโจมตี ผู้เล่นอีกคนหนึ่ง
     * @param opponent คือผู้เล่นที่จะโจมตี
     * effects: ส่งดาเมจที่คำนวณไปให้ผู้ถูกโจมตี
     * */
    @Override
    public void attack(Humanoid opponent) {
        double dmg = calDmg(this);
        opponent.beAttack(dmg);
    }

    /** เป็น method สำหรับคำนวณดาเมทที่ผู้เล่นสามารถทำได้
     * @param Attacker คือผู้เล่นที่จะคำนวณดาเมทของการโจมตี
     * @return ค่าของดาเมทที่ผู้เล่นนั้นทำได้
     * */
    @Override
    public double calDmg(Character1 Attacker) {
        double dmg ;
        if(equippedSword != null){
            dmg = Attacker.equippedSword.getDamage();
        }else{
            dmg = 20 ;
        }
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
