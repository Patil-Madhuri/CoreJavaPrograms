package abstractclass;

abstract class Fruits 
{
	String color;
	String seasonal;
	Fruits(String color,String seasonal)
	{
		this.color = color;
		this.seasonal = seasonal;
	}
	abstract void serve();
	
}


