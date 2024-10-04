package lotr;

class Knight extends StrongChar {
    public Knight() {
        super(5, 15, 5, 15);
    }
    public String toString(){
        return "Knight{hp=" + hp + ", power=" + power + "}";
    }
}