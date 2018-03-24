package src.com.jspider.oece12.DesignPattern.FactoryPattern;

public class HomeLoan extends Loan {

	@Override
	void getInterestRate(double r) {
		rate =r;
	}

}
