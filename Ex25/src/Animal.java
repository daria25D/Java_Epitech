public class Animal {
    public enum Type {
        MAMMAL,
        FISH,
        BIRD
    }
    private static int numberOfAnimals = 0;
    private static int numberOfMammals = 0;
    private static int numberOfFish = 0;
    private static int numberOfBirds = 0;

    private String name;
    private int legs;
    private Type type;
    public Animal(String name, int legs, Type type) {
        this.name = name;
        this.legs = legs;
        this.type = type;
        numberOfAnimals++;
        if (type == Type.MAMMAL) numberOfMammals++;
        else if (type == Type.FISH) numberOfFish++;
        else if (type == Type.BIRD) numberOfBirds++;
        System.out.println("My name is " + name + " and I am a " + type.toString());
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