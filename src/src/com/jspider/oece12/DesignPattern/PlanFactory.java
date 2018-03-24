package src.com.jspider.oece12.DesignPattern;

public class PlanFactory {
	public Plan getPlan(String planType) {
		return planType == null ? null
				: (planType.equalsIgnoreCase("CommericialPlan")) ? new CommericialPlan()
						: (planType.equalsIgnoreCase("DomesticPlan")) ? new DomesticPlan()
								: (planType.equalsIgnoreCase("InstitutionalPlan")) ? new InstitutionalPlan() : null;
	}

}
