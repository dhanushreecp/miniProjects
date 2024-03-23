package message;

public class MoreThan100CharacterException extends RuntimeException
{
	public String getMessage()
	{
		return "You are wasting too much time in typing instead you can call";
	}
}
