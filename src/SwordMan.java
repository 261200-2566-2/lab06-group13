public class SwordMan extends Character1 implements Human{
   public SwordMan(String name){
        super(name);
   }
    @Override
    public void levelUp() {
        super.levelUp();
        intelligence = 100 + 10 * level;
        stamina += 100 +10 * level;
    }

    @Override
    public void attack(Humanoid opponent) {
        if (equippedSword != null){
            double dmg = calDmg(this);
            opponent.beAttack(dmg);
        }else{
            System.out.println("No Sword in hande");
        }
    }



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
