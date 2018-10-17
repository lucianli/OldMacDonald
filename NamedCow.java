class NamedCow extends Cow
{
	private String cowName;
	public NamedCow(String type, String name, String sound)
     {
     	myType = type;
     	cowName = name;
     	mySound = sound;
     }
	public String getName()
	{
		return cowName;
	}

}