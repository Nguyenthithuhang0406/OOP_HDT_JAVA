public abstract class Circle implements IGeometricObject {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * 3.14;
    }

    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }
}
