//Task  requires to show the local time and date before and after formatting

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Date{
	
	public static void main(String[] args) {
		LocalDateTime myTime = LocalDateTime.now();
		System.out.println("Before: " + myTime);
		
		DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy; HH:mm");
		String currentDate = myTime.format(myFormatter);
		System.out.println("After: " + currentDate);
		
	}
}