package LAB_8_TAHIR_SAEED;

public class Employee_HA extends Person_HomeActivity {
	protected String office;
	protected String salary;
	protected String date_hired;
	
	 public Employee_HA() {
		super("tahir","rwp","gmail","092");
	office="HR";
	salary="14000";
	date_hired="7 Nov 2001";
		super.display();
		}
		public void display()
		{
			System.out.println("Name: "+name+"\nAddress: "+address+"\nEmail: "+email+"\nNO: "+phone+"\nOffice: "+office+"\nSalary: "+salary+    "\n DAte Hired: "+ date_hired);
		}
		}

