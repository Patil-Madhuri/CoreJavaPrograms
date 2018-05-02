package extraTask;

class Sys
{
	static final PrintStreams out = new PrintStreams();
}
class PrintStreams extends Sys
{
	void print(String s)
	{
		System.out.print(s);
	}
}
public class Sysout extends PrintStreams
{
	public static void main(String[] args) 
	{
		Sys.out.print("Hii....");
	}
}
