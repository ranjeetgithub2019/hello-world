package pack;

public class StaticMethod {
	
	static int x=10,y=19;
	int z=8;
	
	static int sum()
	{
	
		return x=y+99999;
		
	}

	public static void main(String[] args) {
		
		
		
		int z=sum();
		System.out.println(z);
		
		
		
		
	}

}
