//Qinyao Zhang 11.18.19
package Main;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
  Class								Description
LocalDate			Represents a date (year, month, day (yyyy-MM-dd))
LocalTime			Represents a time (hour, minute, second and milliseconds (HH-mm-ss-zzz))
LocalDateTime		Represents both a date and a time (yyyy-MM-dd-HH-mm-ss.zzz)
DateTimeFormatter	Formatter for displaying and parsing date-time objects
 */

public class DataTime {

	public static void main(String[] args) {

		//print year mounth date
		LocalDate myObj = LocalDate.now();
		System.out.println(myObj);
		
		//print hour min sec
		LocalTime myObj1 = LocalTime.now();
		System.out.println(myObj1);
		
		//print both
		LocalDateTime myObj2 = LocalDateTime.now();
		System.out.println("Before formtting: "+myObj2);
		
		//formatting
		DateTimeFormatter forObj = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
		String format = myObj2.format(forObj);
		System.out.println("After formatting "+format);
		
	}

}
