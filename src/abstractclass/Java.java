package abstractclass;

public class Java extends CodingLanguages
{
	Java(String ScriptingLang)
	{
		super(ScriptingLang);
	}
	@Override
	void language()
	{
		System.out.println("Java can be used to generate secures Software Project");
	}
	
	public static void main(String[] args) 
	{
		Java j = new Java("NO");
		System.out.println("Is it my Scripting language:  "+j.ScriptingLang);
		j.language();
	}
}
