public class TestCylinder {
    public static void main(String[] args) {
        // Test Part A: constructor dan inheritance
        Cylinder c1 = new Cylinder();
        System.out.println("=== Test Default Constructor ===");
        System.out.println("Cylinder: radius=" + c1.getRadius()
            + " height=" + c1.getHeight()
            + " base area=" + c1.getRadius() * c1.getRadius() * Math.PI
            + " surface area=" + c1.getArea()
            + " volume=" + c1.getVolume());

        Cylinder c2 = new Cylinder(10.0);
        System.out.println("\n=== Test Constructor(height) ===");
        System.out.println("Cylinder: radius=" + c2.getRadius()
            + " height=" + c2.getHeight()
            + " surface area=" + c2.getArea()
            + " volume=" + c2.getVolume());

        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("\n=== Test Constructor(radius, height) ===");
        System.out.println("Cylinder: radius=" + c3.getRadius()
            + " height=" + c3.getHeight()
            + " surface area=" + c3.getArea()
            + " volume=" + c3.getVolume());

        // Test constructor dengan color
        Cylinder c4 = new Cylinder(3.0, 5.0, "blue");
        System.out.println("\n=== Test Constructor(radius, height, color) ===");
        System.out.println("Color: " + c4.getColor());

        // Test setColor
        c4.setColor("green");
        System.out.println("After setColor: " + c4.getColor());

        // Test Part B: override getArea() dan getVolume()
        System.out.println("\n=== Test Part B: getArea() dan getVolume() ===");
        Circle circle = new Circle(5.0);
        Cylinder cylinder = new Cylinder(5.0, 10.0);
        System.out.println("Circle area (base): " + circle.getArea());
        System.out.println("Cylinder surface area: " + cylinder.getArea());
        System.out.println("Cylinder volume: " + cylinder.getVolume());

        // Test Part C: override toString()
        System.out.println("\n=== Test Part C: toString() ===");
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(c4);
    }
}
