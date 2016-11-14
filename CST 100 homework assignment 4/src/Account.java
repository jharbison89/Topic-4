import java.util.Date;

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	
	private Date date = new Date();
	private String dateCreated;
	
	Account(){
		dateCreated = date.toString();
	}
	
	Account(int acc, double bal){
		id = acc;
		balance = bal;
		dateCreated = date.toString();
	}
	
	int getId(){
		return id;
	}
	
	void updateId(int acc){
		id = acc;
	}
	
	double getBalance(){
		return balance;
	}
	
	void updateBalance(double bal){
		balance = bal;
	}
	
	double getRate(){
		return annualInterestRate;
	}
	
	void updateRate(double rate){
		annualInterestRate = rate;
	}

	String getDate(){
		return dateCreated;
	}
	
	double getMonthlyInterestRate(){
		return annualInterestRate;
	}
	
	double getMonthlyInterest(){
		return balance * ((annualInterestRate / 100) / 12);
	}
	
	void withdraw(double amount){
		balance = balance - amount;
	}
	
	void deposit(double ammount){
		balance = balance + ammount;
	}
	
}
