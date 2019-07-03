public class Cat extends Animal {
    private Cat() { super("", 4, Animal.Type.MAMMAL); }
    private String color;
    public Cat(String name, String color) {
        super(name, 4, Animal.Type.MAMMAL);
        this.color = color;
        System.out.println(name + ": MEEEOOWWWW");
    }
    public Cat(String name) {
        this(name, "grey");
    }
    public void meow() {
        System.out.println(name + " the " + color + " kitti is meowing.");
    }
}
