package LAB_8_TAHIR_SAEED;

public class laptop extends computer {
	protected int length;
	protected int width;
	protected int height;
	protected int weight;
	public laptop() {
		super();
		super.display();
		length=41;
	height=20;
	weight=8;
	width=14;
	}
	void display1()
	{
	
		System.out.println("Length: "+length+"\nHeight: "+height+"\nWidth: "+width+"\nWeight: "+weight);
	}
}
