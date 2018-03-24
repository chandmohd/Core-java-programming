package src.com.jspider.oece12.DesignPattern.FactoryPattern;

import java.util.Optional;
import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Bank name from where you want to take loan");
		String name = scanner.nextLine();
		System.out.println("\n enter the loan type i,e bussiness loan , home loan etc");
		String loanType = scanner.nextLine();
		Bank bank = FactoryCreator.getFactory("BANK").getBank(name);
		Optional<Bank> optionalBank = Optional.ofNullable(bank);
		if (optionalBank.isPresent()) {
			System.out.println("\n enter the interest rate for " + bank.getBankName());
		} else
			System.out.println("could not found bank for " + optionalBank.toString());
		double rate = scanner.nextDouble();
		System.out.println("\n enter the amount you want to take");

		double amount = scanner.nextDouble();

		System.out.println("enter the number of year t pay yout entire loan amount");
		int year = scanner.nextInt();
		System.out.println("you are taking a loan from " + bank.getBankName());

		Loan loan = FactoryCreator.getFactory("Loan").getLoan(loanType);
		Optional<Loan> optionalLoan = Optional.ofNullable(loan);

		if (optionalLoan.isPresent()) {
			loan.getInterestRate(rate);
			loan.calculateLoanPayment(amount, year);
		} else
			System.out.println("can not get the loan type for " + optionalLoan.toString());
	}

}
