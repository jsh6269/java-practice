package class02;

class BankAccount{
	String accNumber;
	String ssNumber;
	int balance = 0;

	public BankAccount(String acc, String ss, int bal){
		accNumber = acc;  // °èÁÂ¹øÈ£
		ssNumber = ss;    // ÁÖ¹Î¹øÈ£
		balance = bal;    // ÀÜ¾×
	}
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkBalance() {
		System.out.println("°èÁÂ¹øÈ£ : " + accNumber);
		System.out.println("ÀÜ°í       : " + balance);
		System.out.println();
		return balance;
	}
}
public class Class1 {
	public static void main(String[] args) {
		BankAccount A = new BankAccount("12-34-57", "020415-232153", 100000);
		A.deposit(5000);
		A.checkBalance();
		A.withdraw(2000);
		A.checkBalance();
	}
}
