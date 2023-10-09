public class AbstractFactoryCircle implements AbstractFactory {
    @Override
    public Shape createShape(double i, Point point) {
        return new Circle(i, point);
    }
}
