public class AbstractFactorySquare implements AbstractFactory {
    @Override
    public Shape createShape(double i, Point point) {
        return new Square(i, point);
    }
}
