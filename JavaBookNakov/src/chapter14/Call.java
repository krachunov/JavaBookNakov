package chapter14;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.lang.*;

public class Call {
	//pattern 
	static String formatDate = "dd.MM.yyyy";
	static String formatStartDate = "dd.MM.yyyy HH:mm";
	static String formatTimeLong = "HH:mm";
	
	//Date format
	static SimpleDateFormat fDate = new SimpleDateFormat(formatDate);
	static SimpleDateFormat fStartDate = new SimpleDateFormat(formatStartDate);
	static SimpleDateFormat fTimeDate = new SimpleDateFormat(formatTimeLong);
	static Date dateNow = new Date();
	
	static String date = fDate.format(dateNow);
	static String statTime=fStartDate.format(dateNow);
	static String durationTime = fTimeDate.format(dateNow);
	public static int callHistory;
	
	String saveDate;
	String saveStartTimeCall;
	String duration;
	
	public Call(String saveStartTimeCall,String duration){
		this.saveDate=date;
		callHistory++;
		
	}
	
	public static void main(String[] args) {
		System.out.println(date);
		System.out.println(statTime);
		System.out.println(durationTime);
	}
	
}
