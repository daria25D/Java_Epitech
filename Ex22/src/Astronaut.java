public class Astronaut {
    private static int ID = 0;
    private String name;
    private int snacks;
    private String destination;
    private int id;
    public Astronaut(String name) {
        this.name = name;
        snacks = 0;
        destination = null;
        id = ID;
        ID++;
        System.out.println(name + " ready for launch!");
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDestination() {
        return destination;
    }
    public int getSnacks() {
        return snacks;
    }
}
