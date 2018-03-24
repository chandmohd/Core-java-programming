package src.com.jspider.oece12.DesignPattern.FactoryPattern;

public class FactoryCreator {
	public static AbstractFactory getFactory(String choice) {
		return choice.equalsIgnoreCase("Bank") ? new BankFactory()
				: choice.equalsIgnoreCase("Loan") ? new LoanFactory() : null;
	}
}
