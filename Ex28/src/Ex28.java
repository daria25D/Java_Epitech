public class Ex28 {
    public static void main(String[] args) {
        Shark s = new Shark("S");
        s.status();
        s.smellBlood(true);
        s.status();
        s.eat(s);
        s.eat(new Canary("C"));
    }
}
