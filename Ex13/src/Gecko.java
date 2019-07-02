public class Gecko {
    private String name = new String();
    public Gecko() {
        this.name = "Unknown";
        System.out.println("Hello!");
    }
    public Gecko(String name) {
        this.name = name;
        System.out.println("Hello " + name + "!");
    }
    public String getName() {
        return this.name;
    }
}
