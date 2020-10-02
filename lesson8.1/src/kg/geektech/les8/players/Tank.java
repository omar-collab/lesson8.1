package kg.geektech.les8.players;

import java.util.Random;

public class Tank extends Hero {

    public Tank(int health, int damage, SuperAbility superAbility) {
        super(health, damage, superAbility);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            Random r = new Random();
            int randomShield = r.nextInt(50);

            System.out.println("Shield hero " + heroes[i].getHealth() + " damage");
            System.out.println("____________________");
            if (heroes[i].getHealth() > 0) {
                boss.setDamage(boss.getDamage() - randomShield);
            } else if (getHealth() <= 0) {
                System.out.println("Golem died");

            }
        }
    }
}
