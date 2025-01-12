public class Circle {
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public Circle setRadius(int radius) {
        return new Circle(radius);
    }
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.setRadius(10));
        System.out.println(circle.getRadius());
    }
}
