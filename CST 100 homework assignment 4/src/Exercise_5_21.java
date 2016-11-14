import java.util.Scanner;

public class Exercise_5_21 {

	public static double monthlyPayment(double ammount, double rate, int years){
		double payment = ammount * rate / (1 - 1 / Math.pow(1 + rate, years * 12));
		
		return ((int)(payment * 100)) / 100.0;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Loan Ammount: ");
		double principle = input.nextDouble();
		
		System.out.print("Number of Years: " );
		int time = input.nextInt();
		
		input.close();
		
		double monthly = 0;
		double total = 0;
		
		System.out.println("Interest Rate     Monthly Payment    Total Payment\n");
		
		for(double interest = 5.00; interest <= 8.00; interest = interest + 0.125){
			
			monthly = monthlyPayment(principle, interest / 1200, time);
			total = monthly * time * 12;
			
			System.out.printf("%.3f%%            %.2f             %.2f\n", interest, monthly, total);
		}
	}
}
