package week3;

class Rectangle {
    int length,breadth;
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    int area() {
        return length * breadth;
    }
    int perimeter() {
        return (2*(length + breadth));
    }
    void display() {
        System.out.println("Length: " + length + " Breadth: " + breadth);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        r1.display();
    }
}
