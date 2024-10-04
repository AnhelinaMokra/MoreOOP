package lotr;

class King extends StrongChar {
    public King() {
        super(5, 15, 5, 15);
    }

    public String toString(){
        return "King{hp=" + hp + ", power=" + power + "}";
    }
}