public class Shark extends Animal{
    private Shark() {super("", 0, Animal.Type.FISH);}
    private boolean frenzy;
    public Shark(String name) {
        super(name, 0, Animal.Type.FISH);
        frenzy = false;
        System.out.println("A KILLER IS BORN!");
    }
    public void smellBlood(boolean blood) {
        frenzy = blood;
    }
    public void status() {
        if (frenzy) {
            System.out.println(name + " is smelling blood and wants to kill.");
        } else {
            System.out.println(name + " is swimming peacefully.");
        }
    }
}
