package entities;

public class AulaOitentaEUmBank {

	private int accountNumber;
	private String name;
	private double balance;
	
	public AulaOitentaEUmBank() {
		
	}

	public AulaOitentaEUmBank(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		depositAccount (initialDeposit);
	}

	public AulaOitentaEUmBank(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void depositAccount(double deposit) {
		this.balance += deposit;
	}

	public void withdrawAccount(double withdraw) {
		this.balance -= withdraw + 5.00;
	}
	
	public String toString() {
		return "Account "
				+ getAccountNumber()
				+ ", Holder: "
				+ getName()
				+ ", Balance: $ "
				+ String.format("%.2f", getBalance());
	}

}
