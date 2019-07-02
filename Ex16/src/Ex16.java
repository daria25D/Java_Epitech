public class Ex16 {
    public static void main(String[] args) {
        Gecko a = new Gecko("A");
        a.eat("Vegetable");
        System.out.println(a.getEnergy());
        a.eat("meat");
        System.out.println(a.getEnergy());
    }
}
