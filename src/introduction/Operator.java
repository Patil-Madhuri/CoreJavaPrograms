package introduction;

public class Operator {

	public static void main(String[] args) {
		/*int x=10;
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);
		*/
		
		/*
		int a=10,b=10;
		System.out.println(a++ + ++a);
		System.out.println(b++ + b++);
		*/
		
		int a=10,b=20,c,d,e;
		a++;
		b++;
		c = a++;
		d = ++b;
		System.out.println("value=c" +c);
		d++;
		System.out.println("value=d" +d);
		System.out.println("value=a" +a);
		System.out.println("value=b" +b);
		e = b--;
		System.out.println("value=b" +b);
		System.out.println("value=e" +e);
	}

}
