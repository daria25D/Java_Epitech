public class Animal {
    public enum Type {
        MAMMAL,
        FISH,
        BIRD
    }
    protected static int numberOfAnimals = 0;
    protected static int numberOfMammals = 0;
    protected static int numberOfFish = 0;
    protected static int numberOfBirds = 0;

    protected String name;
    protected int legs;
    protected Type type;
    protected Animal(String name, int legs, Type type) {
        this.name = name;
        this.legs = legs;
        this.type = type;
        numberOfAnimals++;
        if (type == Type.MAMMAL) numberOfMammals++;
        else if (type == Type.FISH) numberOfFish++;
        else if (type == Type.BIRD) numberOfBirds++;
        System.out.println("My name is " + name + " and I am a " + type.toString().toLowerCase() + "!");
    }
    public String getName() {return name;}
    public int getLegs() {return legs;}
    public String getType() {return type.toString();}
    public static int getNumberOfAnimals() {
        if (numberOfAnimals == 1)
            System.out.println("There is  currently " + numberOfAnimals + " animal in our world");
        else
            System.out.println("There are currently " + numberOfAnimals + " animals in our world");
        return numberOfAnimals;
    }
    public static int getNumberOfMammals() {
        if (numberOfMammals == 1)
            System.out.println("There is currently " + numberOfMammals + " mammal in our world");
        else
            System.out.println("There are currently " + numberOfMammals + " mammals in our world");
        return numberOfMammals;
    }
    public static int getNumberOfFish() {
        if (numberOfFish == 1)
            System.out.println("There is currently " + numberOfFish + " fish in our world");
        else
            System.out.println("There are currently " + numberOfFish + " fish in our world");
        return numberOfFish;
    }
    public static int getNumberOfBirds() {
        if (numberOfBirds == 1)
            System.out.println("There is currently " + numberOfBirds + " bird in our world");
        else
            System.out.println("There are currently " + numberOfBirds + " birds in our world");
        return numberOfBirds;
    }
}