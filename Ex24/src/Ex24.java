public class Ex24 {
    public static void main(String[] args) {
        Animal isi = new Animal("Isidore", 4, Animal.Type.MAMMAL);
        System.out.println(isi.getName() + " has " + isi.getLegs() + " legs and is a " + isi.getType());
    }
}
