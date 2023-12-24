public class MyApplication{
    public static void main(String[] args) {
        // Create an array of 10 random points (replace with your actual coordinates)
        Point[] points = new Point[10];
        for (int i = 0; i < 10; i++) {
            points[i] = new Point(Math.random(), Math.random());
        }

        // Create a shape with the array of points
        Shape shape = new Shape(points);

        // Test the methods
        double perimeter = shape.perimeter();
        double longestSide = shape.longestSide();
        double averageSide = shape.averageSide();

        // Print the results
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Longest Side: " + longestSide);
        System.out.println("Average Side: " + averageSide);
    }
}