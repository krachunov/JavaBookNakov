package chapter07;
public class Zad03 {

	public static void main(String[] args) {
		char[] array = { 'a', 'b', 'c', 'D', 'e' };
		char[] array2 = { 'b', 'c', 'c', 'd', 'e' };
		boolean equal = true;
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i <= array.length - 1; i++) {
			if (i < array.length - 1) {
				if (array[i] < array[i + 1]) {
					count1++;
				} else {
					break;
				}
			} else {
				break;
			}
			if (i < array2.length - 1) {
				if (array2[i] < array2[i + 1]) {
					count2++;
				} else {
					break;
				}
			} else {
				break;
			}
		}
		System.out.println("����� 1 ������ �� : " + count1+" �������");
		System.out.println("����� 2 ������ �� : " + count2+" �������");
		if(count1<count2){
			System.out.println("����� array � ��-���� � ���������������� ��������");
		}
		else{
			System.out.println("����� array2 � ��-���� � ���������������� ��������");
		}
	

	}
}
