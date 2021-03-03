public class Display {
	public static void printStars(int no)	
	{
		for(int i=1; i<=no; i++)
		{
			for(int j=i; j<=no; j++)
			System.out.print("*");

			System.out.print("\n");
		}
	}
}