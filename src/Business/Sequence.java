package Business;

public class Sequence {
	private static Integer index = 1000;
	
	public static Integer getIndex()
	{
		return Sequence.index++;
		
	}
	
	public static void setIndex( Integer index)
	{
		Sequence.index= index;
	}

}
