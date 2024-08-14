public class ResizeableCircle extends Circle implements IResizeable{
    public ResizeableCircle(double radius) {
        super(radius);
    }
    @Override
    public double resize(int persent) {
        return super.radius * (1 + persent / 100.0);
    }

}
