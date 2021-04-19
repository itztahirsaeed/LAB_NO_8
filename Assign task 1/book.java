package LAB_8_TAHIR_SAEED;

public class book extends publication {
	protected int pageCount;
public book() {
	super();
pageCount=108;

}
void setPage()
{
	pageCount=55;
	
}
int getPage()
{
	return pageCount;
}
void display()
{
	System.out.println("\nPage Count is: "+pageCount);
}
}
