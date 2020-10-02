package kg.geektech.les8.players;

public class Magic extends Hero{
    private int damagePoints;
    public Magic(int health, int damage, int damagePoints) {
        super(health, damage, SuperAbility.BOOST);
        this.damagePoints = damagePoints;

    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

        for (int i = 0; i < heroes.length; i++) {
            if (this != heroes[i] && heroes[i].getDamage() > 0) {
                heroes[i].setDamage(heroes[i].getDamage() + damagePoints);
            }
        }
    }
}
