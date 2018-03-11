package ua.prog.java.lesson2;

public class Quadrilateral extends Shape {
	private Point firstPoint;
	private Point secondPoint;
	private Point thirdPoint;
	private Point fourthPoint;

	public Quadrilateral(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint) {
		super();
		this.firstPoint = firstPoint;
		this.secondPoint = secondPoint;
		this.thirdPoint = thirdPoint;
		this.fourthPoint = fourthPoint;
	}

	public Quadrilateral() {

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

	public Point getFourthPoint() {
		return fourthPoint;
	}

	public void setFourthPoint(Point fourthPoint) {
		this.fourthPoint = fourthPoint;
	}

	private double calculateFirstSideLenght() {
		double firstSideLenght;
		firstSideLenght = Math.sqrt(Math.pow((secondPoint.getX() - firstPoint.getX()), 2)
				+ Math.pow((secondPoint.getY() - firstPoint.getY()), 2));
		return firstSideLenght;
	}

	private double calculateSecondSideLenght() {
		double secondSideLenght;
		secondSideLenght = Math.sqrt(Math.pow((thirdPoint.getX() - secondPoint.getX()), 2)
				+ Math.pow((thirdPoint.getY() - secondPoint.getY()), 2));
		return secondSideLenght;
	}

	private double calculateThirdSideLenght() {
		double thirdSideLenght;
		thirdSideLenght = Math.sqrt(Math.pow((fourthPoint.getX() - thirdPoint.getX()), 2)
				+ Math.pow((fourthPoint.getY() - thirdPoint.getY()), 2));
		return thirdSideLenght;
	}

	private double calculateFourthSideLenght() {
		double fourthSideLenght;
		fourthSideLenght = Math.sqrt(Math.pow((firstPoint.getX() - fourthPoint.getX()), 2)
				+ Math.pow((firstPoint.getY() - fourthPoint.getY()), 2));
		return fourthSideLenght;
	}

	@Override
	public double getPerimetr() {
		double perimetr = calculateFirstSideLenght() + calculateSecondSideLenght() + calculateThirdSideLenght()
				+ calculateFourthSideLenght();
		return perimetr;
	}

	@Override
	public double getArea() {
		return 0;
	}

	@Override
	public String toString() {
		return "Quadrilateral [firstPoint=" + firstPoint + ", secondPoint=" + secondPoint + ", thirdPoint=" + thirdPoint
				+ ", fourthPoint=" + fourthPoint + ", getPerimetr()=" + getPerimetr() + ", getArea()=" + getArea()
				+ "]";
	}

}
