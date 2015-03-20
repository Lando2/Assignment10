import java.util.Date;
public class Account {
	
	private int id;
	private double balance;
	private double annualIntrestRate;
	private Date dateCreated = new Date();
	
	public Account(){
		}
	public Account(int id, double balance, double annualIntrestRate, Date dateCreated){
		this.id = id;
		this.balance = balance;
		this.annualIntrestRate = annualIntrestRate;
		this.dateCreated = dateCreated;
		
	}
	
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualIntrestRate(){
		return annualIntrestRate;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	public double getMonthlyIntrestRate(){
		return annualIntrestRate/12;
	}
	public void Withdraw(double withdraw){
		balance = balance - withdraw;
	}
	public void Deposit(double deposit){
		balance = (deposit + balance);
		
	}
	
	
	}


