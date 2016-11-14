
public class Exercise_5_39 {
	
	public static double commissionEarned(double sales){
		if(sales <= 5000){
			return sales * 0.08;
		}
		else if(sales <= 10000){
			return 5000 * 0.08 + (sales - 5000) * 0.10;
		}
		else
			return 5000 * 0.08 + 5000 * 0.10 + (sales - 10000) * 0.12;
	}

	public static void main(String[] args){
		double sales = 0;
		
		for(sales = 0; commissionEarned(sales) < 25000; sales = sales + .01);
		
		System.out.printf("You need to sell $%.2f to earn $30,000 salary\n", sales);
	}
}
