
public class BankAccount {	
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public BankAccount(int accountNumber, String accountHolder, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", accountBalance="
				+ accountBalance + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("\tfinalize invoked....");
	}

	void withdraw(double amountToWithdraw) {
		System.out.println("Withdrawing...."+amountToWithdraw);
		if(amountToWithdraw > accountBalance) {
			System.err.println("Cannot withdraw...Insufficient funds.... "+ amountToWithdraw);
		}
		else
			accountBalance = accountBalance - amountToWithdraw;
	}
	void deposit(double amountToDeposit) {
		System.out.println("Depositing...."+amountToDeposit);
		if(amountToDeposit > 50000) {
			System.err.println("Cannot deposit...provide proof of income of "+ amountToDeposit);
		}
		else 
			accountBalance = accountBalance + amountToDeposit;
	}
	void showBankAccount() {
		System.out.println("Acc Number  : "+accountNumber);
		System.out.println("Acc Holder  : "+accountHolder);
		System.out.println("Acc Balance : "+accountBalance);
		System.out.println("------------------------");
	}
	
	
}

//default ctor is there
//implicit no-arg ctor there
class A { }


class B {
	//explicit no-arg ctor seen
	B() { }
}

// u can have either of these

/*

	specific function
	which has the name
	as of the enclosing 
	class
	
	- doesnot have return type
	-but it can take arguments
	-it is invoked during object
	creation process
	- hence it can be utilized for
	   object initialization 
	
	

*/