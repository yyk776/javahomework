package homework;
import java.util.Date;
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreate;
	Account() {
		int id = 0;
		double balance = 0;
		double annualInterestRate = 0;
	}
	Account(int id1 , double balance1) {
		int id = id1;
		double balance = balance1;
		double annualInterestRate = balance1;
	}
	public void setId(int newId) {
		id = newId;
	}
	public int getId() {
		return id;
	}
	public void setBalance(int Balance1){
		balance = Balance1;
	}
	public double getBalance(){
		return balance;
	}
	public void setannualInterestRate(double AnnualRate1){
		annualInterestRate = AnnualRate1;
	}
	public double getannualInterestRate(){
		return annualInterestRate;
	}
	public Date getdateCreated(){
		return dateCreate;
	}
	public double getMonthlyInterestRate(){
		return  annualInterestRate / 12;
	}
	public double getMonthlyInterest(){
		return balance * annualInterestRate / 12;
	}
	public void withDraw(double number){
		balance -= number;
	}
	public void deposit(double money){
		balance += money;
	}
}

