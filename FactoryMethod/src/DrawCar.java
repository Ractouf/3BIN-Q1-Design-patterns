public abstract class DrawCar {
	public void draw(int size) {
		double sizeWheel = size / 10;
		double carHeight = size / 2;
		double carLength = size;

		for (int i = 0; i < 50; i++) {
			double center= i / 50 * carLength;
			Shape c = this.createShape(1, new Point(0, center));
		}

		for (int i = 15; i < 35; i++) {
			double center= i / 50 * carLength;
			Shape c = this.createShape(1, new Point(carHeight, center));
		}
	}

	protected abstract Shape createShape(double i, Point point);
}
