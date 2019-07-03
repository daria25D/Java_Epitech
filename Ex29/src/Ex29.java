public class Ex29 {
    public static void main(String[] args) {
        Shark s = new Shark("S");
        Canary c = new Canary("C");
        s.status();
        s.smellBlood(true);
        s.status();
        s.eat(s);
        s.eat(new Canary("C"));
        BlueShark b = new BlueShark("B");
        b.eat(new Animal("fish", 0, Animal.Type.FISH));
        GreatWhite g = new GreatWhite("G");
        g.eat(b);
        g.eat(c);
    }
}
