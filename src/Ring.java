public class Ring extends Accessories implements Accessory {
    private double stamina = 5 ;
    private double addSpeed = 5 ;
    public Ring(String name, String type, String effect) {
        super(name, type, effect);
    }

    /** เป็น method ให้ Effect ของเเหว่น กับ player
     * @param player คือ player ที่จะรับ Effect
     * effects: เพิ่ม Stamina กับ player
     * effects: เพิ่ม Speed กับ player
     */
    @Override
    public void giveEffect(Character1 player) {
        player.setStamina(stamina);
        player.setSpeed(addSpeed);

    }
    /** เป็น method คืน Effect ของเเหว่น ออกจาก player
     * @param player คือ player ที่จะเอา Effect ออก
     * effects: ลด Stamina กับ player
     * effects: ลด Speed กับ player
     */
    @Override
    public void DeEffect(Character1 player) {
        player.setStamina(-1*stamina);
        player.setSpeed(-1* addSpeed);
    }
}
