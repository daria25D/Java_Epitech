public class Ex17 {
    public static void main(String[] args) {
        Gecko a = new Gecko("A");
        for (int i = 0; i < 8; i++) {
            a.eat("vegetable");
        }
        System.out.println(a.getEnergy());
        a.work();
        System.out.println(a.getEnergy());
        a.work();
        System.out.println(a.getEnergy());
        a.work();
        for (int i = 0; i < 5; i++) {
            a.eat("meat");
        }
        System.out.println(a.getEnergy());
    }
}
