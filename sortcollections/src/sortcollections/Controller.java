package sortcollections;

import java.util.Collections;

public class Controller {

	public static void main(String[] args) {
		
		Alarm al = new Alarm();
		
		AddToArrayList ArrayList = new AddToArrayList();
		
		ArrayList.addToArrayList();

		
		System.out.println("order of adding to list");
		
		for(Alarm a: ArrayList.getAlarms()) {
			System.out.println(a.name + "  " + a.alarm);
		}
			
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println();
		
		Collections.shuffle(ArrayList.getAlarms());
		
		System.out.println("shuffle list");
		
		for(Alarm a: ArrayList.getAlarms()) {
			System.out.println(a.name + "  " + a.alarm);
		}
		
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println();
		
		al.sort(ArrayList.getAlarms()); // call of sort
		
		System.out.println("sorted list");
		
		for(Alarm a: ArrayList.getAlarms()) {
			System.out.println(a.name + "  " + a.alarm);
		}
		

	}
}