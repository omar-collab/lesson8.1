package kg.geektech.les8.players;

import java.util.Random;

public class Thor extends Hero {
    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.STUN);
    }

    public void applySuperAbility(Boss boss, Hero[] heroes){
        Random ra = new Random();
        int randomM = ra.nextInt(1);
        if (randomM == 1) {
            boss.setDamage(0);
        }
    }
}
