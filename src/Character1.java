public class Character1 {
    protected String name;
    protected double level, maxHp, hp, maxMana, mana, baseSpeed,speed, maxBaseSpeed,  intelligence, stamina;
//    Accessories[] backpack = new Accessories[4];
    protected Ring ring ;
    protected Necklace necklace;
    protected Sword equippedSword ;
    protected Shield equippedShield ;
    public double getHP() {
        return hp;
    }

    public double getMana() {
        return mana;
    }
    public void levelUp() {
        level++;
        maxHp = 100 + 10 * level;
        maxMana = 50 + 2 * level;
        baseSpeed = 50 + 2 * level;
        maxBaseSpeed = baseSpeed * (2) ;
        speed = maxBaseSpeed ;
        hp = maxHp ;
        mana = maxMana ;
    }
    public void equipSword(Sword sword) {
        unequipSword(); // Unequip any previously equipped sword
        equippedSword = sword;
        speed -= baseSpeed * (0.1 + 0.04 * sword.getLevel());
    }
    public void unequipSword() {
        if (equippedSword != null) {
            speed += baseSpeed * (0.1 + 0.04 * equippedSword.getLevel());
            equippedSword = null;
        }
    }
    public  void equipShield(Shield shield){
        unquipShield();
        equippedShield = shield;
        speed -= baseSpeed * (0.1 + 0.04 * shield.getLevel());
    }
    public  void unquipShield(){
        if (equippedShield != null) {
            speed += baseSpeed * (0.1 + 0.04 * equippedSword.getLevel());
            equippedShield = null;
        }
    }
    protected  Character1(String name){
        this.name = name;
        this.intelligence = 100 ;
        this.level = 1;
        this.maxHp = 100 + 10 * level ;
        this.maxMana = 50 + 2 * level;
        this.baseSpeed = 100 ;
        this.speed = baseSpeed ;
        this.maxBaseSpeed = baseSpeed *(2) ;
        this.hp=maxHp;
        this.mana = maxMana;
        this.stamina = 100;
    }

    public  void EquipAccessories(Ring ring){
        this.ring = ring ;
        ring.giveEffect(this);
    }
    public  void UnEquipAccessories(Ring ring){
        this.ring = null ;
        ring.DeEffect(this);
    }
    public  void EquipAccessories(Necklace necklace){
        this.necklace = necklace ;
        necklace.giveEffect(this);
    }
    public  void UnEquipAccessories(Necklace necklace){
        this.necklace = null ;
        necklace.DeEffect(this);
    }
    public  void setHp(double setHp){
        maxHp += setHp ;
        hp += setHp ;
    }
    public void beAttack(double dmg) {
        if(dmg >= hp){
            this.hp = 0;
        }else {
            this.hp -= dmg ;
        }

    }

    public void setStamina(double stamina) {
        this.stamina += stamina;
    }

    public  void  setSpeed(double speed){
        this.speed += speed ;
    }






}
