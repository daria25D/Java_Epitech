public class Canary extends Animal{
    private Canary() {super("", 2, Animal.Type.BIRD);}
    private int eggs;
    public Canary(String name) {
        super(name, 2, Animal.Type.BIRD);
        eggs = 0;
        System.out.println("Yellow and smart? Here I am!");
    }
    public int getEggsCount() {return eggs;}
    public void layEgg() {eggs++;}
}
