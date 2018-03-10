package ua.prog.java.lesson2;

public class Quadrilateral extends Shape {
	private Point firstPoint;
	private Point secondPoint;
	private Point thirdPoint;
	private Point fourthPoint;
	private double firstSideLenght;
	private double secondSideLenght;
	private double thirdSideLenght;
	private double fourthSideLenght;

	public Quadrilateral(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint) {
		super();
		this.firstPoint = firstPoint;
		this.secondPoint = secondPoint;
		this.thirdPoint = thirdPoint;
		this.fourthPoint = fourthPoint;
		calculateQuadrilateralSidesLenght();
	}

	private void calculateQuadrilateralSidesLenght() {
		// firstSide = sqrt(sqr(x2-x1)+(sqr(y2-y1)));
		firstSideLenght = Math.sqrt(Math.pow((secondPoint.getX() - firstPoint.getX()), 2)
				+ Math.pow((secondPoint.getY() - firstPoint.getY()), 2));

		// secondSide = sqrt(sqr(x3-x2)+(sqr(y3-y2)));
		secondSideLenght = Math.sqrt(Math.pow((thirdPoint.getX() - secondPoint.getX()), 2)
				+ Math.pow((thirdPoint.getY() - secondPoint.getY()), 2));

		// thirdSide = sqrt(sqr(x4-x3)+(sqr(y4-y3)));
		thirdSideLenght = Math.sqrt(Math.pow((fourthPoint.getX() - thirdPoint.getX()), 2)
				+ Math.pow((fourthPoint.getY() - thirdPoint.getY()), 2));

		// fourthSide = sqrt(sqr(x1-x4)+(sqr(y1-y4)));
		thirdSideLenght = Math.sqrt(Math.pow((firstPoint.getX() - fourthPoint.getX()), 2)
				+ Math.pow((firstPoint.getY() - fourthPoint.getY()), 2));
	}

	@Override
	public double getPerimetr() {
		double perimetr = firstSideLenght + secondSideLenght + thirdSideLenght + fourthSideLenght;
		return perimetr;
	}

	@Override
	public double getArea() {
		return 0;
	}

	@Override
	public String toString() {
		return "Quadrilateral [firstPoint=" + firstPoint + ", secondPoint=" + secondPoint + ", thirdPoint=" + thirdPoint
				+ ", fourthPoint=" + fourthPoint + ", firstSideLenght=" + firstSideLenght + ", secondSideLenght="
				+ secondSideLenght + ", thirdSideLenght=" + thirdSideLenght + ", fourthSideLenght=" + fourthSideLenght
				+ ", getPerimetr()=" + getPerimetr() + ", getArea()=" + getArea() + "]";
	}
	
	

}
