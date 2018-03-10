package ua.prog.java.lesson2;

public class Main {

	public static void main(String[] args) {
		Point firstPoint = new Point(1, 2);
		Point secondPoint = new Point(4, 5);
		Point thirdPoint = new Point(6, 2);
		Triangle triangleInstance = new Triangle(firstPoint, secondPoint, thirdPoint);
		System.out.println("Периметр треугольника = " + triangleInstance.getPerimetr());
		System.out.println("Площадь треугольника = " + triangleInstance.getArea());
		System.out.println(triangleInstance);

		System.out.println();

		Point circleCenter = new Point(2, 4);
		Point pointOnCircle = new Point(6, 7);
		Circle circleInstance = new Circle(circleCenter, pointOnCircle);
		System.out.println("Периметр круга = " + circleInstance.getPerimetr());
		System.out.println("Площадь круга = " + circleInstance.getArea());
		System.out.println(circleInstance);

		System.out.println();

		firstPoint = new Point(1, 2);
		secondPoint = new Point(1, 5);
		thirdPoint = new Point(4, 5);
		Point fourthPoint = new Point(4, 2);
		Quadrilateral quadrilateralInstance = new Quadrilateral(firstPoint, secondPoint, thirdPoint, fourthPoint);
		System.out.println("Периметр четырёхугольника = " + quadrilateralInstance.getPerimetr());
		System.out.println("Площадь четырёхугольника = " + quadrilateralInstance.getArea()
				+ " Не ноль естественно но я не осилил эту формулу..");

		System.out.println(quadrilateralInstance.toString());

		Board newBoard = new Board();
		newBoard.putFigure(triangleInstance, 0);
		newBoard.putFigure(circleInstance, 1);
		newBoard.putFigure(quadrilateralInstance, 2);
		newBoard.putFigure(circleInstance, 3);

		newBoard.showDataAllFiguresOnBoard();

		newBoard.putFigure(quadrilateralInstance, 3);
		newBoard.deleteFigure(1);

		newBoard.showDataAllFiguresOnBoard();

		newBoard.deleteFigure(1);

	}

}
