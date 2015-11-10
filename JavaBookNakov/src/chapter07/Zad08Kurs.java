package chapter07;

public class Zad08Kurs {

	public static void main(String[] args) {
		int arr[] = {2 ,1 ,1 ,3 ,3 ,6 ,5 ,5 ,5 ,6};
		
		int index = 0;// startoviq index na teku6tata redica
		int count = 1;// dyljinata na teku6tata redica
		int bestIndex = 0;// startoviq index na nai-dylgata redica
		int bestCount = 0;// dyljinata na nai-dylgata redica
		
		for (int i = 0; i < arr.length; i++) {
			if(i == 0 || arr[i] != arr[i -1]){
				count = 1;
				index = i;
			}else {
				count++;
				if(count > bestCount){
					bestIndex = index;
					bestCount = count;
				}
			}
		}
		for (int j = bestIndex; j < bestIndex + bestCount; j++) {
			System.out.print(arr[j] + " ");
		}

	}

}
