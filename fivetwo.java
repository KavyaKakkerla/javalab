abstract class Employee
{
	abstract public void getAmount();
}
class WeeklyEmployee extends Employee
{	
	int no_of_weeks;
	int totalweeks;
	public WeeklyEmployee(int no_of_weeks,int totalweeks)
	{
		this.no_of_weeks=no_of_weeks;
		this.totalweeks=totalweeks;
	}
	public void getAmount()
	{	
		System.out.println("Amount to be paid for weeekly employee is "+(no_of_weeks*totalweeks));
	}
		
}
class HourlyEmployee extends Employee
{	
	int no_of_hours;
	int totalhours;
	public HourlyEmployee(int no_of_hours,int totalhours)
	{
		this.no_of_hours=no_of_hours;
		this.totalhours=totalhours;
	}
	public void getAmount()
	{	
		System.out.println("Amount to be paid for hourly employee is "+(no_of_hours*totalhours));
	}
		
}

public class fivetwo
{
	public static void main(String args[])
	{	
		 HourlyEmployee h=new HourlyEmployee(20,200);
		WeeklyEmployee w=new WeeklyEmployee(5,500);
		h.getAmount();
	w.getAmount();
	}
	
}
