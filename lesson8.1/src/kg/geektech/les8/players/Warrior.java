package kg.geektech.les8.players;

import java.util.Random;

public class Warrior extends Hero{

    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int critical = random.nextInt(1);
        if (critical == 1){
            setDamage(getDamage() + 100);
        }
    }
}
