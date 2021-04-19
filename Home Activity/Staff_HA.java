package LAB_8_TAHIR_SAEED;

public class Staff_HA extends Employee_HA {
protected String title;
public Staff_HA()
{
	super();
	title="HOD";
}
public void dis()
{
	
	System.out.println("TITLE: "+title);
}
}
