package kg.geektech.les8.players;

public class Boss extends GameEntity {
    private int health;
    private int damage;

    public Boss(int health, int damage) {
        super(health, damage);
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }
}
