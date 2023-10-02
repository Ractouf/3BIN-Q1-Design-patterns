public class Square implements Shape{
	private final double size;
	private final Point center;

	public Square(double size, Point center) {
		this.size = size;
		this.center = center;
	}
	
	public double getSize() {
		return size;
	}

	public Point getCenter() {
		return center;
	}

	@Override
	public void move(int x, int y) {
		// move a Square
	}

	@Override
	public void draw() {
		// draw a Square
	}
	
}
