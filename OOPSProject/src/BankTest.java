
public class BankTest {

	public static void main(String[] args) {

			BankAccount bankObj1 = new BankAccount(101,"Julie",50000);
			bankObj1.showBankAccount();
//The field BankAccount.accountBalance is not visible		
			//bankObj1.accountBalance=99999999;
			
			bankObj1.showBankAccount();

			
			bankObj1.withdraw(60000);bankObj1.showBankAccount();
			
			bankObj1.deposit(1000);bankObj1.showBankAccount();
			
			
		
	}

}


/*

for(int i=1;i<50000;i++) {
			bankAccountObjRef1 = 
					new BankAccount(101+i
							,"Julie"+i
							,5000+i);
			System.out.println("object : "+bankAccountObjRef1);



*/