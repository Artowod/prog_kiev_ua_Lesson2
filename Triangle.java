package ua.prog.java.lesson2;

public class Triangle extends Shape {
	private Point firstPoint;
	private Point secondPoint;
	private Point thirdPoint;
	private double firstSideLenght;
	private double secondSideLenght;
	private double thirdSideLenght;

	public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
		super();
		this.firstPoint = firstPoint;
		this.secondPoint = secondPoint;
		this.thirdPoint = thirdPoint;
		calculateTriangleSidesLenght();
	}

	private void calculateTriangleSidesLenght() {
		// firstSide = sqrt(sqr(x2-x1)+(sqr(y2-y1)));
		firstSideLenght = Math.sqrt(Math.pow((secondPoint.getX() - firstPoint.getX()), 2)
				+ Math.pow((secondPoint.getY() - firstPoint.getY()), 2));

		// secondSide = sqrt(sqr(x1-x3)+(sqr(y1-y3)));
		secondSideLenght = Math.sqrt(Math.pow((firstPoint.getX() - thirdPoint.getX()), 2)
				+ Math.pow((firstPoint.getY() - thirdPoint.getY()), 2));

		// thirdSide = sqrt(sqr(x2-x3)+(sqr(y2-y3)));
		thirdSideLenght = Math.sqrt(Math.pow((secondPoint.getX() - thirdPoint.getX()), 2)
				+ Math.pow((secondPoint.getY() - thirdPoint.getY()), 2));

	}

	@Override
	public double getPerimetr() {
		double perimetr = firstSideLenght + secondSideLenght + thirdSideLenght;
		return perimetr;
	}

	@Override
	public double getArea() {
		double halfPerimetr = getPerimetr() / 2;
		double area = Math.sqrt(halfPerimetr * (halfPerimetr - firstSideLenght) * (halfPerimetr - secondSideLenght)
				* (halfPerimetr - thirdSideLenght));
		return area;
	}

	@Override
	public String toString() {
		return "Triangle [firstPoint=" + firstPoint + ", secondPoint=" + secondPoint + ", thirdPoint=" + thirdPoint
				+ ", firstSideLenght=" + firstSideLenght + ", secondSideLenght=" + secondSideLenght
				+ ", thirdSideLenght=" + thirdSideLenght + ", getPerimetr()=" + getPerimetr() + ", getArea()="
				+ getArea() + "]";
	}

}
