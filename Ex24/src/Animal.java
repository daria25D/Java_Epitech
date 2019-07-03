public class Animal {
    public enum Type {
        MAMMAL,
        FISH,
        BIRD
    }
    private String name;
    private int legs;
    private Type type;
    public Animal(String name, int legs, Type type) {
        this.name = name;
        this.legs = legs;
        this.type = type;
        System.out.println("My name is " + name + " and I am a " + type.toString());
    }
    public String getName() {return name;}
    public int getLegs() {return legs;}
    public String getType() {return type.toString();}
}