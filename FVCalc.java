// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int deposit = Integer.parseInt(args[0]);
		double ratePresentage = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double outcome = 1 + (ratePresentage / 100.0);
		double result = Math.pow(outcome, years);
		double total = deposit * result;
		int roundedTotal = (int) Math.round(total);
		System.out.println(" After " + years + " years, " + deposit + "$ saved at " + ratePresentage + "% will yield " + roundedTotal + "$");
	}
}