
public class Tax {

	int filingStatus;
	int[][] brackets;
	double[] rates;
	double taxableIncome;
	
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;
	
	Tax(){
	}
	
	Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome){
		this.filingStatus = filingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
	}
	
	void setStatus(int status){
		filingStatus = status;
	}
	
	void setBrackets(int[][] bracket){
		brackets = bracket;
	}
	
	void setRates(double[] rate){
		rates = rate;
	}
	
	void setIncome(double income){
		taxableIncome = income;
	}
	
	int getStatus(){
		return filingStatus;
	}
	
	int[][] getBrackets(){
		return brackets;
	}
	
	double[] getRates(){
		return rates;
	}
	
	double getIncome(){
		return taxableIncome;
	}
	
	double getTax(){
		double tax = 0;
		
		
		return tax;
	}
}
