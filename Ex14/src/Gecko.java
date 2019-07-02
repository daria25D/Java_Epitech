public class Gecko {
    private String name = new String();
    private int age;
    public Gecko() {
        this.age = 0;
        this.name = "Unknown";
        System.out.println("Hello!");
    }
    public Gecko(String name, int age) {
        this.age = age;
        this.name = name;
        System.out.println("Hello " + name + "!");
    }
    public Gecko(String name) {
        this(name, 0);
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {return this.age;}
    public void setAge(int age) {this.age = age;}
    public void status() {
        switch (this.age) {
            case 0:
                System.out.println("Unborn");
                break;
            case 1:
            case 2:
                System.out.println("Baby gecko");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Adult gecko");
                break;
            case 11:
            case 12:
            case 13:
                System.out.println("Old gecko");
                break;
            default:
                System.out.println("Impossible gecko");
        }
    }
}
