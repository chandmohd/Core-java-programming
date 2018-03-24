package src.com.jspider.oece12.DesignPattern.FactoryPattern;

public class IciBank implements Bank {
	private final String Bname ;

	public IciBank() {
		Bname = "ICI BANK";
	}

	@Override
	public String getBankName() {
		return Bname;
	}

}
