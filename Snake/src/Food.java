import java.awt.*;
public class Food {
    public enum Type {
        SMALL(1),   // +1
        MEDIUM(2),  // +2
        LARGE(3);   // +3
        private int num;
        Type(int num) {
            this.num = num;
        }
        public int getNum() {
            return num;
        }
    }
    private Type type;
    private Point coord;
    public Food() {
        this.type = Type.SMALL;
        this.coord = new Point(1, 1);
    }
    public Food(Type type, Point coord) {
        this.type = type;
        this.coord = new Point(coord);
    }
    public Point getCoord() {
        return this.coord;
    }
    public Type getType() {
        return this.type;
    }
    public void setCoord(Point coord) {
        this.coord.move(coord.x, coord.y);
    }
    public void setType(Type type) {
        this.type = type;
    }
    public int getX() {
        return this.coord.x;
    }
    public int getY() {
        return this.coord.y;
    }
}
