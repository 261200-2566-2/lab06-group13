public class Necklace extends Accessories implements Accessory {
    public Necklace(String name, String type, String effect) {
        super(name, type, effect);
    }
    private double addHp = 5 ;
    private double speed = -5 ;

    /** เป็น method ให้ Effect สร้อยคอ กับ player
     * @param player คือ player ที่จะรับ Effect
     * effects: เพิ่ม Hp กับ player
     * effects: เพิ่ม Speed กับ player
     */
    @Override
    public void giveEffect(Character1 player) {
        player.setHp(addHp);
        player.setSpeed(speed);

    }


    /** เป็น method คืน Effect สร้อยคอ ออกจาก player
     * @param player คือ player ที่จะเอา Effect ออก
     * effects: ลด Hp กับ player
     * effects: ลด Speed กับ player
     */
    @Override
    public void DeEffect(Character1 player) {
        player.setHp(-1*addHp);
        player.setSpeed(-1*speed);
    }
}
