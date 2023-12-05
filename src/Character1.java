public class Character1 {
    protected String name;
    protected double level, maxHp, hp, maxMana, mana, baseSpeed,speed, maxBaseSpeed,  intelligence, stamina;
//    Accessories[] backpack = new Accessories[4];
    protected Ring ring ;
    protected Necklace necklace;
    protected Sword equippedSword ;
    protected Shield equippedShield ;


    /** เป็น method ที่ทำการคืนค่า HP ปัจจุบันออกมาก
     * @return ค่าของ HP ออกมาก
     */
    public double getHP() {
        return hp;
    }



    /** เป็น method ที่ทำการคืนค่า Mana ปัจจุบันของตัวละครออกมาก
     * @return ค่าของ Mana ออกมาก
     */
    public double getMana() {
        return mana;
    }



    /** เป็น method เพิ่ม level และ เพิ่มค่าต่างๆของตัวละคร
     * effects: ทำการเพิ่มค่าต่างๆของ ตัวละคร
     */
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

    /** เป็น method ที่ทำการใส่ดาบให้ตัวละคร
     * @param sword เป็นดาบที่เราต้องการที่จะใส่ให้กับตัวละคร
     * effects: ทำการถอดดาบที่เคยถือออก
     * effects: ทำการใส่ดาบที่ต้องการจะใส่
     * effects: ลดความเร็วของตัวละครลง
     */
    public void equipSword(Sword sword) {
        unequipSword(); // Unequip any previously equipped sword
        equippedSword = sword;
        speed -= baseSpeed * (0.1 + 0.04 * sword.getLevel());
    }



    /** เป็น method ที่ทำการถอดดาบที่ถือออก
     * effects: ทำการถอดดาบที่ถือออก
     */
    public void unequipSword() {
        if (equippedSword != null) {
            speed += baseSpeed * (0.1 + 0.04 * equippedSword.getLevel());
            equippedSword = null;
        }
    }


    /** เป็น method ที่ทำการใส่โล่ให้ตัวละคร
     * @param shield เป็นโล่ที่เราต้องการที่จะใส่ให้กับตัวละคร
     * effects: ทำการถอดโล่ที่เคยถือออก
     * effects: ทำการใส่โล่ที่ต้องการจะใส่
     * effects: ลดความเร็วของตัวละครลง
     */
    public  void equipShield(Shield shield){
        unquipShield();
        equippedShield = shield;
        speed -= baseSpeed * (0.1 + 0.04 * shield.getLevel());
    }

    /** เป็น method ที่ทำการถอดโล่ที่ถือออก
     * effects: ทำการถอดโล่ที่ถือออก
     */
    public  void unquipShield(){
        if (equippedShield != null) {
            speed += baseSpeed * (0.1 + 0.04 * equippedSword.getLevel());
            equippedShield = null;
        }
    }

    /** Constructor สร้างตัวละคร
    * @param name ชื่อของตัวละครที่ต้องการจะตั้ง
     */
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


    /** เป็น method ที่ทำการใส่แหว่นให้ตัวละคร
     * @param ring เป็นแหว่นที่เราต้องการที่จะใส่ให้กับตัวละคร
     * effects: ทำการใส่แหว่นให้ตัวละคร เปลี่ยนค่าของตัวเเปล ring ใน class
     * effects: ทำการมอบ effect ให้ตัวละคร
     * */
    public  void EquipAccessories(Ring ring){
        this.ring = ring ;
        ring.giveEffect(this);
    }


    /** เป็น method ที่ทำการถอดแหว่นให้ตัวละคร
     * @param ring เป็นแหว่นที่เราต้องการที่จะถอดให้กับตัวละคร
     * effects: ทำการถอดแหว่นให้ตัวละคร
     * effects: ทำการถอด effect  ที่ได้จากแหว่นออกจากตัวละคร
     * effects: "This ring is not Equip" จะถูกพิม ถ้าเเหว่นที่จะถอดไม่ตรงกับแหว่นที่ใส่อยู่
     * */
    public  void UnEquipAccessories(Ring ring){
        if(ring == this.ring){
            this.ring = null ;
            ring.DeEffect(this);
        }else {
            System.out.println("This ring is not Equip");
        }

    }

    /** เป็น method ที่ทำการใส่สร้อยคอให้ตัวละคร
     * @param necklace เป็นสร้อยคอที่เราต้องการที่จะใส่ให้กับตัวละคร
     * effects: ทำการใส่สร้อยคอให้ตัวละคร
     * effects: ทำการมอบ effect ที่ได้จากแหว่นให้ตัวละคร
     * */
    public  void EquipAccessories(Necklace necklace){
        this.necklace = necklace ;
        necklace.giveEffect(this);
    }


    /** เป็น method ที่ทำการถอดสร้อยคอให้ตัวละคร
     * @param necklace เป็นสร้อยคอที่เราต้องการที่จะถอดให้กับตัวละคร
     * effects: ทำการถอดสร้อยคอให้ตัวละคร
     * effects: ทำการถอด effect ที่ได้จากสร้อยคอ ออกจากตัวละคร
     * effects: "This necklace is not Equip" จะถูกพิม สร้อยคอที่จะถอดไม่ตรงกับสร้อยคอที่ใส่อยู่
     * */
    public  void UnEquipAccessories(Necklace necklace){
        if(this.necklace == necklace){
            this.necklace = null ;
            necklace.DeEffect(this);
        }else{
            System.out.println("This necklace is not Equip");
        }
    }


    /** เป็น method ที่ทำการเพิ่มเลือดให้กับจัวละคร
     * @param setHp เป็นจำนวณเลือดที่ต้องการที่จะเพิ่ม
     * effects: เพิ่ม hp ของตัวละคร
     * effects: เพิ่ม maxhp ของตัวละคร
     * */
    public  void setHp(double setHp){
        maxHp += setHp ;
        hp += setHp ;
    }

    /** เป็น method ที่ทำการรับการโจมตี
     * @param dmg เป็นดาเมจที่ได้รับ
     * effects: ลดเลือดของตัวละคร
     * */
    public void beAttack(double dmg) {
        if(dmg >= hp){
            this.hp = 0;
        }else {
            this.hp -= dmg ;
        }

    }
    /** เป็น method ที่ทำการเพิ่มค่า stamina  ของตัวละคร
     * @param stamina เป็น stamina ที่ต้องการที่จะเพิ่ม
     * effects: เพิ่ม stamina ของตัวละคร
     * */
    public void setStamina(double stamina) {
        this.stamina += stamina;
    }


    /** เป็น method ที่ทำการเพิ่มค่า Speed  ของตัวละคร
     * @param speed เป็น speed ที่ต้องการที่จะเพิ่ม
     * effects: เพิ่ม speed ของตัวละคร
     * */
    public  void  setSpeed(double speed){
        this.speed += speed ;
    }






}
