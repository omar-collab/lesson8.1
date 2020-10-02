package kg.geektech.les8.players;

public abstract class Hero extends GameEntity
implements HavingSuperAbility {
    private SuperAbility superAbility;
    public Hero(int health, int damage, SuperAbility superAbility) {
        super(health, damage, SuperAbility.STUN);
        this.superAbility = superAbility;
    }
}
