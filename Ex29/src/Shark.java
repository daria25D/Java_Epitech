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
    public boolean canEat(Animal animal) {
        if (this == animal) return false;
        return true;
    }
    public void eat(Animal animal) {
        if (canEat(animal)) {
            System.out.println(this.name + " ate a " + animal.getType() + " named " + animal.getName() + ".");
            if (frenzy)
                frenzy = false;
        } else
            System.out.println(this.name + ": It's not worth my time.");

    }
}
