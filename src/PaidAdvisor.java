
public class PaidAdvisor extends Person {
	public int regularPayRate = 25;
	public int specialPayRate = 50;
	public int overtimePayRate = 37;
	
	int hoursWorked;
	int specialHours;
	
	public PaidAdvisor()
	{
		super();
		setRate(25);
	}
	
	public PaidAdvisor(String first, String last, int regPay)
	{
		super(first, last);
		setRate(regPay);
	}
	
	public void setRate(int rate)
	{
		regularPayRate = rate;
		specialPayRate = rate*2;
		overtimePayRate = (int)(rate*1.5);
	}
	
	public void setHours(int hours)
	{
		hoursWorked = hours;
	}
	
	public void setSpecialHours(int hours)
	{
		specialHours = hours;
	}
	
	public void setNameRateHours(String first, String last, int rate, int hours)
	{
		setRate(rate);
		super.setName(first, last);
		hoursWorked = hours;
		specialHours = 0;
	}
	
	public int getHoursWorked()
	{
		return hoursWorked+specialHours;
	}

	public int getPayRate()
	{
		return regularPayRate;
	}

	public int calculatePay()
	{
		int baseHours = hoursWorked;
		int overtimeHours = 0;
		if(baseHours > 30)
		{
			overtimeHours = baseHours - 30;
			baseHours = 30;
		}

		return (baseHours*regularPayRate + overtimeHours*overtimePayRate + specialHours*specialPayRate);
	}
	
	@Override
	public String toString() {
		String parentToStr = super.toString();
		int baseHours = hoursWorked;
		int overtimeHours = 0;
		if(baseHours > 30)
		{
			overtimeHours = baseHours - 30;
			baseHours = 30;
		}
		return parentToStr + " has worked " + getHoursWorked() + " total hours:\n"
				+ "$" + baseHours + " regular hours at " + getPayRate() + "/hour\n" 
				+ "$" + overtimeHours + " overtime hours at " + overtimePayRate + "/hour\n" 
				+ "$" + specialHours + " special hours at " + specialPayRate + "/hour\n"
				+ "=================\n"
				+ "Paycheck: $" + calculatePay();
	} // Method to set firstName and lastName
	
	
}
