package LAB_8_TAHIR_SAEED;

public class tape extends publication{
	protected int playTime;
public tape() {
	super.display();
playTime=60;
}
void setT()
{
	playTime=55;
	
}
int getT()
{
	return playTime;
}
void display()
{
	System.out.println("\nTime count is: "+playTime);
}

}
