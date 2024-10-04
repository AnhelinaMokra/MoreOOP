package lotr;

import java.util.Random;

public class StrongChar extends Character {

    public StrongChar(int minPower, int maxPower, int minHp, int maxHp) {
        Random rand = new Random();
        this.power = minPower + rand.nextInt(maxPower - minPower + 1);
        this.hp = minHp + rand.nextInt(maxHp - minHp + 1);
    }

    @Override
    public void kick(Character c) {
        Random rand = new Random();
        int damage = rand.nextInt(this.power + 1);  // Damage between 0 and this.power
        c.setHp(c.hp - damage);
        System.out.println(this.getClass().getSimpleName() + " deals " + damage + " damage to the opponent.");
    }
}
