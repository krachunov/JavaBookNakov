package chapter06;
import java.util.Arrays;
import java.util.Scanner;

public class Zad12 {

	public static void main(String[] args) {
		// ��������� �� ������������ ����� � ���������
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number on 10numeric system");
		int number = scan.nextInt();
		// ������� �����, ����� �� ������� ����� ���� �� ������� ������ �
		// ��������� ����� �� � ����� ������ � ����� ��������
		int count = 0;
		for (int i = number; i > 0; i /= 2) {
			count++;
		}
		int[] array = new int[count];
		// ��������� �� 1 ��� 0 �� ��� �� ����, ������ ���� ���� ��� ��� ����
		// �������.
		int x = (array.length) - 1;
		for (int i = number; i > 0; i /= 2) {
			if (i % 2 != 0) {
				array[x] = 1;
				x--;
			} else {
				array[x] = 0;
				x--;
			}

		}
		// ����������� �� ������ �� 1 � 0
		System.out.println(java.util.Arrays.toString(array));
		for (int b : array) {
			System.out.print(b);
		}
	}
}
