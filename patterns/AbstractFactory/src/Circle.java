public class Circle implements Shape {
	private final double diameter;
	private final Point center;

	public Circle(double diameter, Point center) {
		this.diameter = diameter;
		this.center=center;
	}
	
	public double getDiameter() {
		return diameter;
	}
	
	public Point getCenter() {
		return center;
	}


	@Override
	public void move(int x, int y) {
		// move a Circle
	}

	@Override
	public void draw() {
		// draw a Circle
	}
}
