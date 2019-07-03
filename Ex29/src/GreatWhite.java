import java.lang.*;
public class GreatWhite extends Shark {
    private GreatWhite() {super("");}
    public GreatWhite(String name) {
        super(name);
    }

    @Override
    public boolean canEat(Animal animal) {
        if (animal instanceof Canary) {
            System.out.println(this.name + ": Next time you try to give me that to eat, I'll eat you instead.");
            return false;
        } else if (this == animal)
            return false;
        else if (animal instanceof Shark) {
            System.out.println(this.name + ": The best meal one could wish for.");
            return true;
        }
        return true;
    }
}
