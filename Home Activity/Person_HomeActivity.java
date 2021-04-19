package LAB_8_TAHIR_SAEED;

public class Person_HomeActivity {
protected String name;
protected String address;
protected String email;
protected String phone;
 void display()
{
	System.out.println("Name: "+name+"\nAddress: "+address+"\nEmail: "+email+"\nNO: "+phone);
}
public Person_HomeActivity() {
name="TAHIR";
address="RWP";
email="tahirsaeedt7009@gmail.com";
phone="03107292149";

}
public Person_HomeActivity(String name,String address,String email,String phone) 
{
	this.name=name;
	this.address=address;
	this.email=email;
	this.phone=phone;
	
}

}
