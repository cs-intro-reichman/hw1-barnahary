// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int deposit = Integer.parseInt(args[0]);
		double ratePresentage = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		int result = (int) (deposit * (Math.pow((1 + (ratePresentage / 100.0)), years)));
		System.out.println(" After " + years + " years, a $" + deposit + " saved at " + ratePresentage + "% will yield $" + result );
	}
}