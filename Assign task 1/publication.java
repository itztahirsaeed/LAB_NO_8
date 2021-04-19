package LAB_8_TAHIR_SAEED;

public class publication {
protected String title;
protected int price;
public publication() {
title="TAHIR SAEED";
price=999;
}
void setTitle(String s)
{
	title=s;
}

void setPrice(int s1)
{
	price=s1;
}
String getTitle()
{
	return title;
}

int getPrice()
{
	return price;
}
void display()
{
	System.out.println("TITLE IS: "+title+"\nPrice is: "+price);
}
}

