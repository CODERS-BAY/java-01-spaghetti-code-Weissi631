package geo;
public class Geometrics {
    private static double x = 10.0;
    private static double y = 5.0;
    private static double z = 3.0;
    private static int x1 = 8;
    private static int y1 = 7;
    private static int z1 = 10;
    private static int x2 = 100;
    private static int y2 = 57;
    private static int z2 = 129;
    private static int x3 = 45;
    private static int y3 = 89;
    private static int z3 = 69;

    public static void main(String[] args) {
        // area ... Fläche
        System.out.println("Square area");
        System.out.println("x * x = " + calcRectangleArea(x, x));
        System.out.println("x1 * x1 = " + calcRectangleArea(x1, x1));
        System.out.println("x2 * x2 = " + calcRectangleArea(x2, x2));
        System.out.println("y * y = " + calcRectangleArea(y, y));

        // perimeter ... Umfang
        System.out.println("Square perimeter");
        System.out.println("4 * x = " + calcRectanglePerimeter(x, x));
        System.out.println("4 * x1 = " + calcRectanglePerimeter(x1, x1));
        System.out.println("4 * x2 = " + calcRectanglePerimeter(x2, x2));
        System.out.println("4 * y = " + calcRectanglePerimeter(y, y));

        System.out.println("Rectangle area");
        System.out.println("x * y = " + calcRectangleArea(x, y));
        System.out.println("x1 * y1 = " + calcRectangleArea(x1, y1));
        System.out.println("x2 * y2 = " + calcRectangleArea(x2, y2));
        System.out.println("x3 * y3 = " + calcRectangleArea(x3, y3));

        System.out.println("Rectangle perimeter");
        System.out.println("x + y = " + calcRectanglePerimeter(x, y));
        System.out.println("x1 + y1 = " + calcRectanglePerimeter(x1, y1));
        System.out.println("x2 + y2 = " + calcRectanglePerimeter(x2, y2));
        System.out.println("x3 + y3 = " + calcRectanglePerimeter(x3, y3));

        System.out.println("We can also calculate some volumes");
        /*
            z is our height
            y is our radius
         */
        System.out.println("Zone of a sphere");
        System.out.println(calcZoneOfSphere(x, y, z));

        System.out.println("Sphere with cylinder");
        System.out.println(calcSphereWithCylinder(z));

        System.out.println("Ungula");
        System.out.println(calcUngula(x3, z3));
    }
    
    public static int calcRectangleArea(int lenght, int width) {
        return width * width;
    }

    public static double calcRectangleArea(double lenght, Double width) {
        return width * width;
    }

    public static int calcRectanglePerimeter(int lenght, int width) {
        return 2*lenght + 2*width;
    }

    public static double calcRectanglePerimeter(double lenght, double width) {
        return 2*lenght + 2*width;
    }

    public static double calcZoneOfSphere(double x, double y, double z) {
        return (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
    }

    public static double calcSphereWithCylinder(double z) {
        return Math.PI * Math.pow(z, 3) / 6;
    }

    public static double calcUngula(double x, double y) {
        return 2 * x3 * z3 / 3;
    }
}
