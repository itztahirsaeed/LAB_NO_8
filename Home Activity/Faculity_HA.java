package LAB_8_TAHIR_SAEED;

public class Faculity_HA extends Employee_HA {
	protected int hours;
	protected int rank;
	public Faculity_HA()
	{
		super();
		hours=14;
		rank=9;
		
	}
	public void display()
	{
		System.out.println("\nHours: "+hours+ "\n Rank: "+rank);
	}
}
