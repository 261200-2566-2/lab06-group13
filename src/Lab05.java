// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Lab05 {
    public static void main(String[] args) {
        SwordMan B1 = new SwordMan("Tonza01");
        SwordMan B2 = new SwordMan("Tonza02");
        Sword e = new Sword();
        Shield s = new Shield();
        Ring r = new Ring("The_U" , "ring " , "addheat");
        Necklace n = new Necklace("The_U" , "ring " , "addheat");

        B1.equipSword(e);
        B2.levelUp();
        B2.levelUp();
        B2.levelUp();
        B2.EquipAccessories(r);
        B2.EquipAccessories(n);
        B2.equipShield(s);
        B1.attack(B2);
    }
}