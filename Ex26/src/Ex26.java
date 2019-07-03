public class Ex26 {
    public static void main(String[] args) {
        Cat a = new Cat("A", "orange");
        System.out.println(a.getName() + " has " + a.getLegs() + " legs and is a " + a.getType());
        a.meow();
    }

}
