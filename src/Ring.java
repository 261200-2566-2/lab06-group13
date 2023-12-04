public class Ring extends Accessories implements Accessory {
    private double stamina = 5 ;
    private double addSpeed = 5 ;
    public Ring(String name, String type, String effect) {
        super(name, type, effect);
    }

    @Override
    public void giveEffect(Character1 player) {
        player.setStamina(stamina);
        player.setSpeed(addSpeed);

    }

    @Override
    public void DeEffect(Character1 player) {
        player.setStamina(-1*stamina);
        player.setSpeed(-1* addSpeed);
    }
}
