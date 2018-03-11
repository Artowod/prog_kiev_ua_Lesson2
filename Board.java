package ua.prog.java.lesson2;

public class Board {
	/*
	 * 4. Создайте класс доска. Доска поделена на 4 части в каждую часть доски можно
	 * положить одну из фигур. У доски должны быть методы которые помещают и удаляют
	 * фигуру с доски. Также должен быть метод который выводит информацию о всех
	 * фигурах лежащих на доске и их суммарную площадь.
	 */
	private Shape[] figures = new Shape[4];

	public Board() {

	}

	public boolean putFigure(Shape figure, int sectionNumberWhereToPut) {
		if (sectionNumberWhereToPut < 0 || sectionNumberWhereToPut > 3) {
			System.out.println("\n----!!---Вы ввели неверный номер ячейки.---!!----");
			return false;
		}
		if (figures[sectionNumberWhereToPut] == null) {
			figures[sectionNumberWhereToPut] = figure;
			return true;
		} else {
			System.out.println("\nЗаданная ячейка " + sectionNumberWhereToPut + " уже занята.");
			return false;
		}
	}

	public boolean deleteFigure(int sectionNumberWhereToPut) {
		if (sectionNumberWhereToPut < 0 || sectionNumberWhereToPut > 3) {
			System.out.println("\n----!!---Вы ввели неверный номер ячейки.---!!----");
			return false;
		}
		if (figures[sectionNumberWhereToPut] != null) {
			figures[sectionNumberWhereToPut] = null;
			return true;
		} else {
			System.out.println("\nЗаданная ячейка " + sectionNumberWhereToPut + " и так пустая.");
			return false;
		}
	}

	public void showDataAllFiguresOnBoard() {
		double totalPerimeterAllFiguresOnBoard = 0;
		System.out.println("\n--------------Board-------------");
		for (int x = 0; x < figures.length; x++) {
			if (figures[x] != null) {
				totalPerimeterAllFiguresOnBoard = totalPerimeterAllFiguresOnBoard + figures[x].getArea();
				System.out.println("Ячейка " + x + " :" + figures[x].getClass().getSimpleName().toString());
			}
		}
		System.out.println("--------------------------------");
		System.out.println("Суммарная площадь всех фигур на доске: " + totalPerimeterAllFiguresOnBoard);
		System.out.println("--------------------------------");
	}

}
