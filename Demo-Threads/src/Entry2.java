import com.cg.Account;

public class Entry2 {

	public static void main(String[] args) throws InterruptedException {
		Account account1 = new Account();
		Account account2 = new Account();	
		
		Thread dtThread = new DepositThread(account1);
		Thread wtThread = new WithdrawThread(account2);
		
		dtThread.start();
		
		dtThread.interrupt();
		
		wtThread.start();
		
/*		dtThread.join();
		wtThread.join();
*/		
		System.out.println( account1.getBalance());;;;;;;;;;;;;;;
		System.out.println( account2.getBalance());;
	}

}

class DepositThread extends Thread {
	// Account account = new Account();
	private Account account;

	public DepositThread(Account account) {
		this.account = account;
	}

	
	public void run() {
		try {
			account.deposit(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class WithdrawThread extends Thread {
	// Account account = new Account();
	private Account account;

	public WithdrawThread(Account account) {
		this.account = account;
	}

	public void run() {
		try {
			account.withdraw(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
