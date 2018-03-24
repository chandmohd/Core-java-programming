package src.com.jspider.oece12.DesignPattern.FactoryPattern;

public class SbiBank implements Bank {
	private final String Bname;

	public SbiBank() {
		Bname = "SBI BANK";
	}

	@Override
	public String getBankName() {
		return Bname;
	}

}
