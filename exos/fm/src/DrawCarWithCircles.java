public class DrawCarWithCircles extends DrawCar {
    @Override
    protected Shape createShape(double i, Point point) {
        return new Circle(i, point);
    }
}
