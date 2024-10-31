package oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        Square sq = new Square("Square");
        Rectangle rec = new Rectangle("Rectangle");
        Circle cir = new Circle("Circle");
        sq.printInfo(4, 5.0f);
        rec.printInfo(5.0f, 10.0f, 2);
        cir.printInfo(0, 5.0f);
    }
}

class Shape {
    String name;
    float height;
    float width;
    float radius;
    int sides;

    public void printInfo(float height, float width, int sides) {
        System.out.println("Shape type: " + this.name + "\nWidth: " + width + "\nHeight: " + height+ "\nSides: " + sides);
    }

    public void printInfo(float radius, int sides) {
        System.out.println("Shape type: " + this.name + "\nRadius: " + radius + "\nSides: " + sides);
    }

    public void printInfo(int sides, float width) {
        System.out.println("Shape type: " + this.name + "\nWidth: " + width + "\nSides: " + sides);
    }

    public void draw() {
        System.out.println("Shape created!");
    }
}

class Square extends Shape {
    Square(String name) {
        this.name = name;
        draw();
    }
}
class Rectangle extends Shape {
    Rectangle(String name) {
        this.name = name;
        draw();
    }
}
class Circle extends Shape {
    Circle(String name) {
        this.name = name;
        draw();
    }
}