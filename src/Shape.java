public class Shape {
    private Point[] points;

    // Constructor
    public Shape(Point[] points) {
        this.points = points;
    }

    // Calculate perimeter of the shape
    public double perimeter() {
        double perimeter = 0;
        int n = points.length;

        for (int i = 0; i < n - 1; i++) {
            perimeter += points[i].distanceTo(points[i + 1]);
        }

        // Add the distance from the last point to the first point
        perimeter += points[n - 1].distanceTo(points[0]);

        return perimeter;
    }

    // Find the length of the longest side
    public double longestSide() {
        double longest = 0;

        for (int i = 0; i < points.length - 1; i++) {
            double sideLength = points[i].distanceTo(points[i + 1]);
            if (sideLength > longest) {
                longest = sideLength;
            }
        }

        // Check the distance from the last point to the first point
        double lastSide = points[points.length - 1].distanceTo(points[0]);
        if (lastSide > longest) {
            longest = lastSide;
        }

        return longest;
    }

    // Calculate average length of the sides
    public double averageSide() {
        double totalLength = 0;
        int n = points.length;

        for (int i = 0; i < n - 1; i++) {
            totalLength += points[i].distanceTo(points[i + 1]);
        }

        // Add the distance from the last point to the first point
        totalLength += points[n - 1].distanceTo(points[0]);

        return totalLength / n;
    }
}