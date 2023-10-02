public class StrategySquare implements Strategy {
    @Override
    public Shape createShape(double i, Point point) {
        return new Square(i, point);
    }
}
