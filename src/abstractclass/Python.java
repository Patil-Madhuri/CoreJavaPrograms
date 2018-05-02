package abstractclass;

public class Python extends CodingLanguages
{
	Python(String ScriptingLang)
	{
		super(ScriptingLang);
	}
	@Override
	void language()
	{
		System.out.println("Python can be used for data analysis");
	}
	
	public static void main(String[] args) 
	{
		Python p = new Python("YES");
		System.out.println("Is it my Scripting language:  "+p.ScriptingLang);
		p.language();
	}
}
