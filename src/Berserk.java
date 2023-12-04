public class Berserk extends Character1 implements Human{
    Berserk(String name){
        super(name);
    }

    @Override
    public void attack(Humanoid opponent) {
        double dmg = calDmg(this);
        opponent.beAttack(dmg);
    }

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
