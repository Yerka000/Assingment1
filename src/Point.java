public class Point {
    private double x;
    private double y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Calculate distance to another point
    public double distanceTo(Point destination) {
        double dx = destination.x - this.x;
        double dy = destination.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // String representation of the point
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
