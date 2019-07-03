public class Ex27 {
    public static void main(String[] args) {
        Shark s = new Shark("S");
        Canary c = new Canary("C");
        s.status();
        s.smellBlood(true);
        s.status();

        c.layEgg();
        System.out.println(c.getEggsCount());
    }

}
