package LAB_8_TAHIR_SAEED;

public class student_HA extends Person_HomeActivity {
protected String status;
public student_HA() {
super("tahir","rwp","gmail","092");
status="Active";
super.display();
}
public void display()
{
	System.out.println("Name: "+name+"\nAddress: "+address+"\nEmail: "+email+"\nNO: "+phone+"\nStatus: "+status);
}
}
