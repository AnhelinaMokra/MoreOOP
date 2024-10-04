package lotr;

public class Character {
    int power;
    int hp;

    public void kick(Character c) {
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power){
        this.power = power;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public int getHp() {
        return this.hp;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }
}
