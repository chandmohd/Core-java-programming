package src.com.jspider.oece12.DesignPattern.FactoryPattern;

public class LoanFactory extends AbstractFactory {

	@Override
	public Loan getLoan(String loan) {
		return loan == " " || loan == null ? null
				: loan.equalsIgnoreCase("Education Loan") ? new EducationLaon()
						: loan.equalsIgnoreCase("Bussiness Loan") ? new BussinessLoan()
								: loan.equalsIgnoreCase("Home Loan") ? new HomeLoan() : null;
	}

	@Override
	public Bank getBank(String bank) {
		return null;
	}

}
