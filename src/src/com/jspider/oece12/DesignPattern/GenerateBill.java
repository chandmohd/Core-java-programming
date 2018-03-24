package src.com.jspider.oece12.DesignPattern;

import java.util.Scanner;

public class GenerateBill {
	public static void main(String[] args) {
		PlanFactory planFactory = new PlanFactory();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the plan for which you want to generate bill");
		String planName = scanner.next();
		System.out.print("Enter the number of units for bill will be calculated: ");
		int units = scanner.nextInt();
		Plan plan = planFactory.getPlan(planName);

		System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
		if (plan != null) {
			plan.getRate();
			plan.calculateBill(units);
		} else
			System.out.println("plan are not availabe for " + planName);
	}

}
