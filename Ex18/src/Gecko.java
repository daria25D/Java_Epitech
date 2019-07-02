public class Gecko {
    private String name;
    private int age;
    private int energy;

    public Gecko() {
        this.age = 0;
        this.energy = 100;
        this.name = "Unknown";
        System.out.println("Hello!");
    }

    public Gecko(String name, int age) {
        this.age = age;
        this.energy = 100;
        this.name = name;
        System.out.println("Hello " + name + "!");
    }

    public Gecko(String name) {
        this(name, 0);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy(int energy) {
        if (energy < 0)
            this.energy = 0;
        else if (energy > 100)
            this.energy = 100;
        else
            this.energy = energy;
    }

    public void status() {
        switch (this.age) {
            case 0:
                System.out.println("Unborn");
                break;
            case 1:
            case 2:
                System.out.println("Baby gecko");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Adult gecko");
                break;
            case 11:
            case 12:
            case 13:
                System.out.println("Old gecko");
                break;
            default:
                System.out.println("Impossible gecko");
        }
    }

    public void hello(String yourName) {
        System.out.format("Hello %s, I'm %s!\n", yourName, this.name);
    }

    public void hello(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello, I'm " + this.name + "!");
        }
    }

    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println("Yummy!");
            this.setEnergy(this.getEnergy() + 10);
        } else if (food.equalsIgnoreCase("Vegetable")) {
            System.out.println("Erk!");
            this.setEnergy(this.getEnergy() - 10);
        } else {
            System.out.println("I can't eat this!");
        }
    }

    public void work() {
        if (this.energy >= 25) {
            System.out.println("I'm working T.T");
            this.setEnergy(this.getEnergy() - 9);
        } else {
            System.out.println("Heyyy I'm too sleepy, better take a nap!");
            this.setEnergy(this.getEnergy() + 50);
        }
    }

    public void goingToDrink(String name) {
        System.out.println("I'm going to drink with " + name + "!");
    }

    public void noEnergyToGoOut(String name) {
        System.out.println("Sorry " + name + ", I'm too tired to go out tonight.");
    }

    public void anotherTimeThen() {
        System.out.println("Oh! That's too bad, another time then!");
    }

    public void notToday() {
        System.out.println("Not today!");
    }

    public void fraternize(Gecko gecko) {
        if (this.getEnergy() >= 30 && gecko.getEnergy() >= 30) {
            this.goingToDrink(gecko.getName());
            gecko.goingToDrink(this.getName());
            this.setEnergy(this.getEnergy() - 30);
            gecko.setEnergy(gecko.getEnergy() - 30);
        } else if (this.getEnergy() < 30 && gecko.getEnergy() < 30) {
            this.notToday();
            gecko.notToday();
        } else {
            if (this.getEnergy() < 30) {
                this.noEnergyToGoOut(gecko.getName());
                gecko.anotherTimeThen();
            } else {
                gecko.noEnergyToGoOut(this.getName());
                this.anotherTimeThen();
            }
        }
    }

    public void fraternize (Snake snake) {
        if (this.getEnergy() >= 10) {
            this.setEnergy(0);
            System.out.println("LET'S RUN AWAY!!!");
        } else {
            System.out.println("...");
        }
    }
}
