
public class Candidate {
	//int id;
	String name;
	int votes;
	
	public Candidate(String name)
	{
		//this.id=id;
		this.name=name;
		votes=0;
	}
	
	//public int getId()
	//{
	//	return id;
	//}
	
	public String getName()
	{
		return name;
	}
	
	public void incrementCount()
	{
		votes++;
	}
	public int getCount()
	{
		return votes;
	}
}

