import java.util.Date;
public class TestAccount {
	public static void main(String[] args){

		Date dateCreated = new Date();
		
		Account a = new Account(1122,20000,4.5,dateCreated);
		
		a.Withdraw(2500);
		a.Deposit(3000);
		System.out.println("Balance = "+a.getBalance()+"\nMonthly Interest = "+a.getMonthlyIntrestRate()+
				"\nDate of account creation: "+a.getDateCreated());
		
	}

}
