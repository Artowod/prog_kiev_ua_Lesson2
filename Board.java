package ua.prog.java.lesson2;

public class Board {
	/*
	 * 4. �������� ����� �����. ����� �������� �� 4 ����� � ������ ����� ����� �����
	 * �������� ���� �� �����. � ����� ������ ���� ������ ������� �������� � �������
	 * ������ � �����. ����� ������ ���� ����� ������� ������� ���������� � ����
	 * ������� ������� �� ����� � �� ��������� �������.
	 */
	private Shape[] figures = new Shape[4];

	public Board() {

	}

	public boolean putFigure(Shape figure, int sectionNumberWhereToPut) {
		if (sectionNumberWhereToPut < 0 || sectionNumberWhereToPut > 3) {
			System.out.println("\n----!!---�� ����� �������� ����� ������.---!!----");
			return false;
		}
		if (figures[sectionNumberWhereToPut] == null) {
			figures[sectionNumberWhereToPut] = figure;
			return true;
		} else {
			System.out.println("\n�������� ������ " + sectionNumberWhereToPut + " ��� ������.");
			return false;
		}
	}

	public boolean deleteFigure(int sectionNumberWhereToPut) {
		if (sectionNumberWhereToPut < 0 || sectionNumberWhereToPut > 3) {
			System.out.println("\n----!!---�� ����� �������� ����� ������.---!!----");
			return false;
		}
		if (figures[sectionNumberWhereToPut] != null) {
			figures[sectionNumberWhereToPut] = null;
			return true;
		} else {
			System.out.println("\n�������� ������ " + sectionNumberWhereToPut + " � ��� ������.");
			return false;
		}
	}

	public void showDataAllFiguresOnBoard() {
		double totalPerimeterAllFiguresOnBoard = 0;
		System.out.println("\n--------------Board-------------");
		for (int x = 0; x < figures.length; x++) {
			if (figures[x] != null) {
				totalPerimeterAllFiguresOnBoard = totalPerimeterAllFiguresOnBoard + figures[x].getArea();
				System.out.println("������ " + x + " :" + figures[x].getClass().getSimpleName().toString());
			}
		}
		System.out.println("--------------------------------");
		System.out.println("��������� ������� ���� ����� �� �����: " + totalPerimeterAllFiguresOnBoard);
		System.out.println("--------------------------------");
	}

}
