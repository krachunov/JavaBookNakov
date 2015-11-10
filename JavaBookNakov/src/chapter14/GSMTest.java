package chapter14;
import java.io.ObjectInputStream.GetField;


public class GSMTest {

	public static void main(String[] args) {
		GSM phone1 = new GSM();
		GSM phone2 = new GSM("M2", "Sonny");
		GSM phone3 = new GSM("m55", "Nokia");
		//how to add in to array
		GSM[] arr=new GSM[3];
		arr[0]=phone1;
		arr[1]=phone2;
		arr[2]=phone3;
		
		for(GSM b:arr){
			b.printInfo();
		}
		
		
		
//		String text = GSM.getNokiaN95();
//		System.out.println(text);
		

	}

}
