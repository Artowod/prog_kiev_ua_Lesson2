package ua.prog.java.lesson2;

public class Triangle extends Shape {
	private Point firstPoint;
	private Point secondPoint;
	private Point thirdPoint;

	public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
		super();
		this.firstPoint = firstPoint;
		this.secondPoint = secondPoint;
		this.thirdPoint = thirdPoint;
	}

	public Triangle() {

	}

	public Point getFirstPoint() {
		return firstPoint;
	}

	public void setFirstPoint(Point firstPoint) {
		this.firstPoint = firstPoint;
	}

	public Point getSecondPoint() {
		return secondPoint;
	}

	public void setSecondPoint(Point secondPoint) {
		this.secondPoint = secondPoint;
	}

	public Point getThirdPoint() {
		return thirdPoint;
	}

	public void setThirdPoint(Point thirdPoint) {
		this.thirdPoint = thirdPoint;
	}

	private double calculateFirstSideLenght() {
		double firstSideLenght;
		firstSideLenght = Math.sqrt(Math.pow((secondPoint.getX() - firstPoint.getX()), 2)
				+ Math.pow((secondPoint.getY() - firstPoint.getY()), 2));

		return firstSideLenght;
	}

	private double calculateSecondSideLenght() {
		double secondSideLenght;
		secondSideLenght = Math.sqrt(Math.pow((firstPoint.getX() - thirdPoint.getX()), 2)
				+ Math.pow((firstPoint.getY() - thirdPoint.getY()), 2));
		return secondSideLenght;
	}

	private double calculateThirdSideLenght() {
		double thirdSideLenght;
		thirdSideLenght = Math.sqrt(Math.pow((secondPoint.getX() - thirdPoint.getX()), 2)
				+ Math.pow((secondPoint.getY() - thirdPoint.getY()), 2));
		return thirdSideLenght;
	}

	@Override
	public double getPerimetr() {
		double perimetr = calculateFirstSideLenght() + calculateSecondSideLenght() + calculateThirdSideLenght();
		return perimetr;
	}

	@Override
	public double getArea() {
		double halfPerimetr = getPerimetr() / 2;
		double area = Math.sqrt(halfPerimetr * (halfPerimetr - calculateFirstSideLenght())
				* (halfPerimetr - calculateSecondSideLenght()) * (halfPerimetr - calculateThirdSideLenght()));
		return area;
	}

	@Override
	public String toString() {
		return "Triangle [firstPoint=" + firstPoint + ", secondPoint=" + secondPoint + ", thirdPoint=" + thirdPoint
				+ ", getPerimetr()=" + getPerimetr() + ", getArea()=" + getArea() + "]";
	}

}
