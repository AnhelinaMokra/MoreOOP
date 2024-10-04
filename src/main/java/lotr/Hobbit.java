package lotr;

class Hobbit extends Character {
    public Hobbit() {
        this.power = 0;
        this.hp = 3;
    }

    @Override
    public void kick(Character c) {
        toCry();
    }

    public void toCry() {
        System.out.println("Hobbit cries.");
    }

    public String toString(){
        return "Hobbit{hp=" + hp + ", power=" + power + "}";
    }
}
