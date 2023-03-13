package Class;

class BankAccount{
	private int balance;
	private String ssNumber;
	private String accNumber;
	public BankAccount(String ssNumber, String accNumber, int balance) {
		this.ssNumber = ssNumber;
		this.accNumber = accNumber;
		this.balance = balance;
	}
	public BankAccount() {
		this("None", "None", 0);
	}
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("ÁÖ¹Î¹øÈ£ : " + ssNumber);
		System.out.println("°èÁÂ¹øÈ£ : " + accNumber);
		System.out.println("ÀÜ¾× : "+balance);
		System.out.println();
		return balance;
	}
}

public class BankAccount00 {
	public static void main(String[] args) {
		BankAccount yoon = new BankAccount("020415-2312521", "21343", 2000);
		BankAccount park = new BankAccount();
		yoon.deposit(5000);
		park.deposit(3000);
		yoon.withdraw(2000);
		park.withdraw(1000);
		yoon.checkMyBalance();
		park.checkMyBalance();
	}
}
