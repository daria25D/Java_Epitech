import java.util.WeakHashMap;

public class BlueShark extends Shark {
    private BlueShark() {super("");}

    public BlueShark(String name) {
        super(name);
    }

    @Override
    public boolean canEat(Animal animal) {
        if (animal.getType().equals("fish") && this != animal)
            return true;
        return false;
    }
}
