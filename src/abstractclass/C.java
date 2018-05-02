package abstractclass;

public class C extends CodingLanguages 
{
	C(String ScriptingLang)
	{
		super(ScriptingLang);
	}
	@Override
	void language()
	{
		System.out.println("Root of Every Language");
	}
	
	public static void main(String[] args) 
	{
		C c = new C("NO");
		
		System.out.println("Is it my Scripting language:  "+c.ScriptingLang);
		c.language();
		
	}
}
