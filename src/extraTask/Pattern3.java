package extraTask;

public class Pattern3 {
	public static void main(String[] args) {
	char c = 'a';
	
	for(int i=3 ;i>=1; i--)
	{
		for(int k=3; k>=i; k--)
		{
			System.out.print(c++);
		}
		for(int j=1; j<=i;j++)
		{
			System.out.print(j);
		}
		
		System.out.println();
		
	}

}
}
