// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
	
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		if ( hours > 12 && hours <= 24) {
			if ( hours > 12 ) {
			hours = hours - 12;
			}
			System.out.println(String.format("%2d:%02d PM", hours, minutes));
		} else {
			System.out.println(String.format("%2d:%02d AM", hours, minutes));
	} 
	}
}