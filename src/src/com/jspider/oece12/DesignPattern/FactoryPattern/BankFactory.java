package src.com.jspider.oece12.DesignPattern.FactoryPattern;

public class BankFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {
		return bank == null ? null
				: bank.equalsIgnoreCase("SBI BANK") ? new SbiBank()
						: bank.equalsIgnoreCase("HDFC bank") ? new HdfcBank()
								: bank.equalsIgnoreCase("ICI BANK") ? new IciBank() : null;
	}

	@Override
	public Loan getLoan(String loan) {
		return null;
	}

}
