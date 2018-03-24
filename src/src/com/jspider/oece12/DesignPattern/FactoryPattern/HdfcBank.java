package src.com.jspider.oece12.DesignPattern.FactoryPattern;

public class HdfcBank implements Bank {
	private final String Bname;

	public HdfcBank() {
		Bname = "HDFC BANK";
	}

	@Override
	public String getBankName() {
		return Bname;
	}

}
