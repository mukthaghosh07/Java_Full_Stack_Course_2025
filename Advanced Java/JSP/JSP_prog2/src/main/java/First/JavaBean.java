package First;

public class JavaBean
{
	private int id;
	private String name;
	private int salary;
	
	public JavaBean()
	{
		
	}
	public  void setId(int id)
	{
		this.id=id;
		
	}
	public int  getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	
	public  String getName()
	{
		return name;
	}
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	
	
	
}

