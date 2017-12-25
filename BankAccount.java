package chapter2;



public class BankAccount
{
private String name; 
private  double  balance;
private int accountID;
private double interestRate;
public static int numberOfAccounts = 0; 

public BankAccount ()
{
balance = 0.00;
name = "No Name";
accountID = 0;
interestRate = 0.00;
numberOfAccounts++;
}

public BankAccount(double balance, int accountID)
{
deposit (balance); 
name = "No Name";
setAccountID(accountID);
interestRate = 0.00;
numberOfAccounts++;
}

public BankAccount(double balance, double interestRate, int accountID)
{
deposit (balance); 
setInterestRate(interestRate);
setAccountID(accountID);
name = "No Name";
numberOfAccounts++;
} 

public BankAccount(double balance, double interestRate, String name, int accountID)
{
deposit (balance);
setInterestRate(interestRate); 
setName(name);
setAccountID(accountID);
numberOfAccounts++;
}


public String getName()
{
return name;
}


public void  setName(String name)
{
this.name  =  name;
}


 public double getInterestRate()
{
return interestRate;
}

public void  setInterestRate(double interestRate)
{
this.interestRate  =  interestRate;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public double getBalance ()
{
return balance;
}

public static int getNumberOfAccounts ()
{
return numberOfAccounts;
}


public double deposit (double amount)
{
	balance =balance + amount;
	return balance;
} 

public  double  withdraw  (double amount)
{	
		balance = balance - amount;
		return balance;
}

public void addInterest ()
{
double interest = balance *  interestRate;

balance = balance +  interest;
}


public static void showBalance (BankAccount account)
{
System.out.print (account.getBalance());

}

public int getAccountID() {
	return accountID;
}

public void setAccountID(int accountID) {
	this.accountID = accountID;
}


}