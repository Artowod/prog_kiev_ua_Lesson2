package ua.prog.java.lesson2;

public class Circle extends Shape {
	private Point center;
	private Point pointOnCircle;
	private double radius;

	public Circle(Point center, Point pointOnCircle) {
		super();
		this.center = center;
		this.pointOnCircle = pointOnCircle;
		calculateRadiusLength();
	}

	private void calculateRadiusLength() {
		// r^2 = (x — h)^2 + (y — k)^2
		radius = Math.sqrt(Math.pow((center.getX() - pointOnCircle.getX()), 2)
				+ Math.pow((center.getY() - pointOnCircle.getY()), 2));
	}

	@Override
	public double getPerimetr() {
		double perimetr = 2 * Math.PI * radius;
		return perimetr;
	}

	@Override
	public double getArea() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + ", pointOnCircle=" + pointOnCircle + ", radius=" + radius
				+ ", getPerimetr()=" + getPerimetr() + ", getArea()=" + getArea() + "]";
	}
}
