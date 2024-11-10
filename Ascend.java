// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]) * Math.random();
		double b = Double.parseDouble(args[0]) * Math.random();
		double c = Double.parseDouble(args[0]) * Math.random();
		double maxNumber = Math.max (a, Math.max(b, c));
		double minNumber = Math.min (a, Math.min(b, c));
		double midNumber = (a + b + c - maxNumber - minNumber);
		int roundedA =(int) Math.round( a );
		int roundedB = (int) Math.round( b );
		int roundedC = (int) Math.round( c );
		int roundedMax = (int) Math.round( maxNumber );
		int roundedMid = (int) Math.round( midNumber );
		int roundedMin = (int) Math.round( minNumber );
		System.out.println(roundedA + " " + roundedB + " " + roundedC);
		System.out.println(roundedMax + " " + roundedMid  + " " + roundedMin );

	}
}
