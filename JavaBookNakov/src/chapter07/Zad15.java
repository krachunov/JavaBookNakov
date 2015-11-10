package chapter07;
public class Zad15 {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 6, 5 };

		int i = 0;
		int j = arr.length ;
		int pivot = ((i+j)/2);
		
		while(i<=j){
			while(arr[i]<pivot){
				i++;
			}
			while(arr[j]>pivot){
				j++;
			}
			if(i<=j){
				int tmp=0;
				tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
			}
		}
	}
}