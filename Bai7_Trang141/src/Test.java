public class Test {
    public static void main(String[] args) {
        Circle c =  new ResizeableCircle(5.0);
        System.out.println("chu vi la: " + c.getPerimeter());
        System.out.println("dien tich la: " + c.getArea());
    }
}
