package sortcollections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class AddToArrayList {
	
	ArrayList<Alarm> alarms = new ArrayList<Alarm>();
	
	public void addToArrayList(){
		
		LocalDate ld = LocalDate.of(1991, 10, 30);
		LocalTime lt = LocalTime.of(2, 10);
		
		alarms.add(new Alarm("hey", LocalDateTime.of(ld, lt)));

		for (int x = 1; x < 5; x++) {
			for (int y = 1; y < 4; y++) {
				LocalDate lda = LocalDate.of(1991, 10, x);
				LocalTime lti = LocalTime.of(y, 10);
				alarms.add(new Alarm(y +"" + y*x, LocalDateTime.of(lda, lti)));
			}
		}
		
		ld = LocalDate.of(1991, 10, 29);
		lt = LocalTime.of(2, 10);
		
		alarms.add(new Alarm("hey", LocalDateTime.of(ld, lt)));		
	}
	
	public ArrayList<Alarm> getAlarms(){
		return alarms;
	}
}
