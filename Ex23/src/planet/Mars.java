package planet;

public class Mars {
    private String landingSite;
    private static int ID = 0;
    private int id;
    public Mars(String landingSite) {
        this.landingSite = landingSite;
        id = ID;
        ID++;
    }
    public String getLandingSite() {
        return landingSite;
    }
    public int getId() {
        return id;
    }
}
