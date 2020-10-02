package kg.geektech.les8.players;

public abstract class GameEntity {
    private int health;
    private int damage;

    public GameEntity(int health, int damage, SuperAbility stun) {
        this.health = health;
        this.damage = damage;
    }

    public GameEntity(int health, int damage) {

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
