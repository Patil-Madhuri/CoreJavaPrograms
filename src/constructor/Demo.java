package constructor;

public class Demo {
int a=10,b=20,result;
/*void m1()
{
	result = a + b;
	System.out.println("Addition= "+result);
}
*/
int m1()
{ 
	result = a+ b;
	
	return result;
}
public static void main(String args[])
{
	Demo d = new Demo();
	int c1 =d.m1();
	System.out.println("Addition=" +c1);
	System.out.println(d.m1());
}

}
