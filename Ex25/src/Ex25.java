public class Ex25 {
    public static void main(String[] args) {
        Animal a = new Animal("A", 4, Animal.Type.MAMMAL);
        Animal b = new Animal("B", 0, Animal.Type.FISH);
        Animal c = new Animal("C", 0, Animal.Type.FISH);
        System.out.println(Animal.getNumberOfAnimals());
        System.out.println(Animal.getNumberOfMammals());
        System.out.println(Animal.getNumberOfFish());
    }
}
