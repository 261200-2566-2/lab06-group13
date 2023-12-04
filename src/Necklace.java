public class Necklace extends Accessories implements Accessory {
    public Necklace(String name, String type, String effect) {
        super(name, type, effect);
    }
    private double addHp = 5 ;
    private double speed = -5 ;


    public void giveEffect(Character1 player) {
        player.setHp(addHp);
        player.setSpeed(speed);

    }

    @Override
    public void DeEffect(Character1 player) {
        player.setHp(-1*addHp);
        player.setSpeed(-1*speed);
    }
}
