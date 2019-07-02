public class Ex14 {
    public static void main(String[] args) {
        Gecko a = new Gecko("A", 9);
        Gecko b = new Gecko("B");
        Gecko c = new Gecko();
        a.status();
        b.status();
        c.status();
        c.setAge(2);
        c.status();
        b.setAge(7);
        System.out.println(b.getAge());
    }
}
