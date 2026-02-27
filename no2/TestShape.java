public class TestShape {
    public static void main(String[] args) {
        // Test Circle
        System.out.println("=== Test Circle ===");
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        Circle c2 = new Circle(5.0, "blue", false);
        System.out.println(c2);
        System.out.println("Area: " + c2.getArea());
        System.out.println("Perimeter: " + c2.getPerimeter());

        // Test Rectangle
        System.out.println("\n=== Test Rectangle ===");
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        Rectangle r2 = new Rectangle(4.0, 6.0, "green", true);
        System.out.println(r2);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        // Test Square
        System.out.println("\n=== Test Square ===");
        Square s1 = new Square();
        System.out.println(s1);
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());

        Square s2 = new Square(5.0, "yellow", true);
        System.out.println(s2);
        System.out.println("Area: " + s2.getArea());
        System.out.println("Perimeter: " + s2.getPerimeter());

        // Test setWidth dan setLength pada Square (harus tetap persegi)
        s2.setWidth(7.0);
        System.out.println("After setWidth(7): " + s2);
        System.out.println("Width: " + s2.getWidth() + ", Length: " + s2.getLength());

        // Test polymorphism
        System.out.println("\n=== Test Polymorphism ===");
        Shape[] shapes = {c2, r2, s2};
        for (Shape s : shapes) {
            System.out.println(s);
            System.out.println("Area: " + s.getArea());
            System.out.println("Perimeter: " + s.getPerimeter());
            System.out.println();
        }
    }
}
