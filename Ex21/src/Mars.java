public class Mars {
    private static int ID = 0;
    private int id;
    public Mars() {
        id = ID;
        ID++;
    }
    public int getID() {
        return id;
    }
}
