public interface Accessory {
    /** เป็น method ให้ Effect ของ Accessory กับ player
     * @param player คือ player ที่จะรับ Effect
     */
    void giveEffect(Character1 player);

    /** เป็น method คืน Effect ของ Accessory ออกจาก player
     * @param player คือ player ที่จะเอา Effect ออก
     */
    void DeEffect(Character1 player);
}
