package ua.prog.java.lesson2;

public class Circle extends Shape {
	private Point center;
	private Point pointOnCircle;

	public Circle(Point center, Point pointOnCircle) {
		super();
		this.center = center;
		this.pointOnCircle = pointOnCircle;
	}

	public Circle() {

	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public Point getPointOnCircle() {
		return pointOnCircle;
	}

	public void setPointOnCircle(Point pointOnCircle) {
		this.pointOnCircle = pointOnCircle;
	}

	private double calculateRadiusLength() {
		double radius;
		radius = Math.sqrt(Math.pow((center.getX() - pointOnCircle.getX()), 2)
				+ Math.pow((center.getY() - pointOnCircle.getY()), 2));
		return radius;
	}

	@Override
	public double getPerimetr() {
		double perimetr = 2 * Math.PI * calculateRadiusLength();
		return perimetr;
	}

	@Override
	public double getArea() {
		double area = Math.PI * Math.pow(calculateRadiusLength(), 2);
		return area;
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + ", pointOnCircle=" + pointOnCircle + ", getPerimetr()=" + getPerimetr()
				+ ", getArea()=" + getArea() + "]";
	}

}
