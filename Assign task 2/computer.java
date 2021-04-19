package LAB_8_TAHIR_SAEED;

public class computer {
protected int wordsize;
protected int memorysize;
protected int storagesize;
protected int speed;
public computer() {
wordsize=8;
memorysize=9;
speed=300;
storagesize=90;
}
public void display()
{
	System.out.println("WORD SIZE IS: "+wordsize+"\nMEMORY SIZE: "+memorysize+"\nSpeed: "+speed+"\nStorage: "+storagesize);
}
}
