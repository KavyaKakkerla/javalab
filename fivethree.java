interface Vehicle
{	
	getCompany();
	getModel();
	getType();
	getConsumption();
	default void displayCompany()
	{
		System.out.println("Company is "+getCompany());
	}
	default void displayModel()
	{
		System.out.println("Model is "+getModel());
	}
	default void displayType()
	{
		System.out.println("Type is "+getType());
	}
	
	calculateFuel();
}

class TwoWheeler implements Vehicle
{	
	String companyname;
	String model;
	String type;
	double consumption;
	private TwoWheeler(String companyname,String model,String type,double consumption)
	{
		this.companyname=companyname;
		this.modl=model;
		this.type=type;
		this.consumption=consumption;
	}
	public String getCompany()
	{	
		return company;
	}
	public String getModel()
	{
		return model;
	}
	public String getType()
	{
		return type;
	}
	public void calculateFuel(double distance)
	{
		
		if(
		
		
		
		System.out.println("The consumption is "+
}
	
