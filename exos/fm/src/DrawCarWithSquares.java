public class DrawCarWithSquares extends DrawCar {
	@Override
	protected Shape createShape(double i, Point point) {
		return new Square(i, point);
	}
}
