package lotr;

class Elf extends Character {
    public Elf() {
        this.power = 10;
        this.hp = 10;
    }

    @Override
    public void kick(Character c) {
        if (c.power < this.power) {
            c.hp = 0;
            System.out.println("Elf kills the opponent.");
        } else {
            c.power -= 1;
            System.out.println("Elf reduces opponent's power by 1.");
        }
    }

    public String toString(){
        return "Elf{hp=" + hp + ", power=" + power + "}";
    }
}
