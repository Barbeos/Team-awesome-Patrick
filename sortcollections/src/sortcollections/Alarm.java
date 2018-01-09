package sortcollections;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Alarm{
	String name;
	LocalDateTime alarm;
	
	public Alarm(String name, LocalDateTime alarm) {
		this.name = name;
		this.alarm = alarm;
	}
	
	public Alarm() {
	}

	//Comparator for sort byDateTime
	Comparator<Alarm> byDateTime = new Comparator<Alarm>() {
		public int compare(Alarm left, Alarm right) {
			if (left.getLocalDateTime().isBefore(right.getLocalDateTime())) {
				return -1;
			} else {
				return 1;
			} 
		}
	};
	
	// a getter for use with sort byDateTime
	private LocalDateTime getLocalDateTime() {
		return alarm;
	}
	
	// function sort
	public void sort(ArrayList<Alarm> alarms) {
		Collections.sort(alarms, byDateTime);
	}
}
