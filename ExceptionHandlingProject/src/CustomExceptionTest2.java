
//unchecked
class InsufficientBalanceException extends RuntimeException
{
	InsufficientBalanceException(String str) {
		super(str);
	}
}

//checked
class AccountOpeningBalanceException extends Exception
{
	AccountOpeningBalanceException(String str) {
		super(str);
	}
}

public class CustomExceptionTest2 {
	public static void main(String[] args) {
		
		System.out.println("Banking started....");
		
		//complier ignores the try catch mandate for unchecked exceptions
		
		//problem during account creation
		
		//compiler NEVER ignores the checked exceptions
		//it is mandatory to try and catch them... to have err msg on the screen
		//or succesfull execution of the logic
		BankAccount bankAcc = null;
		//try {
			bankAcc = new BankAccount(420,"Smith",30000);
	//	} catch (AccountOpeningBalanceException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}
		System.out.println("bankAcc : "+bankAcc);
		
		
		//after creation : withdraw service is also problematic
		
		bankAcc.withdraw(6500); //expecting some runtime problems
		
						//ATMNotResponding
						//
		
							//door lock
		// automatic lock   		vs			manual lock
		
		// lock is deployed 				lock is somewhere in the home
		//on the door						and key is also somewhere
		
		//key is with you					//key is with you 
		
		//now you want to exit the door with locking your house
		
		
		
		System.out.println("bankAcc : "+bankAcc);
		
		bankAcc.withdraw(6500); //expecting some runtime problems
		System.out.println("bankAcc : "+bankAcc);


		bankAcc.withdraw(6500); //expecting some runtime problems
		System.out.println("bankAcc : "+bankAcc);

		bankAcc.withdraw(6500); //expecting some runtime problems
		System.out.println("bankAcc : "+bankAcc);

		bankAcc.withdraw(6500); //expecting some runtime problems
		System.out.println("bankAcc : "+bankAcc);

		System.out.println("Banking over....");

	}
}

class BankAccount
{
	int accountNumber;
	String accountHolder;
	float accountBalance;
	
	public BankAccount(int accountNumber,
			String accountHolder, float accountBalance) throws AccountOpeningBalanceException
	{
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		if(accountBalance <5000) {
			AccountOpeningBalanceException ex = new AccountOpeningBalanceException("Account opening balance should be min 5000/- Rs");
			throw ex;
		}
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", accountBalance="
				+ accountBalance + "]";
	}
	
	void withdraw(float amt) //throws not required, since it is unchecked 
	{
		System.out.println("withdrawing...."+amt);
		if(amt > accountBalance) {
			InsufficientBalanceException ex = new InsufficientBalanceException("Insufficient funds...");
			throw ex; //literal throw 
		}
		accountBalance = accountBalance - amt;
	}
	
}
