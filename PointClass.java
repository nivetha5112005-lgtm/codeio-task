package week4;
class Point {
    int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    void display() {
        System.out.println("Point:" + x + ", " + y );
    }
}
public class PointClass {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(p1);
        p1.display();

        System.out.println("Copied Point");
        p2.display();
        p2.display();
    }
}
