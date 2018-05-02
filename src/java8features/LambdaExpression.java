package java8features;
interface Drawable
{
	void draw();
	
}
public class LambdaExpression
{
	public static void main(String[] args) 
	{
		int width=100;

        Drawable d2=()->
        {  
            System.out.println("Drawing "+width);  
        };  
        d2.draw();  
        
        Drawable d1=()->
        {
        	System.out.println("Drawing22" +width);
        };
        d1.draw();
//		Drawable d1=()->
//		{
//			
//		}
	}
}