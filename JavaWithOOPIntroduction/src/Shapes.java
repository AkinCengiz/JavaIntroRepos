
public class Shapes {
	
	void rectangeDraw(int width, int height)
	{
		System.out.println("\n");
		for(int i = 0; i < height; i++)
		{
			for(int j = 0; j < width; j++)
			{
				System.out.print(" * ");
			}
			System.out.println("\n");
		}
	}
	void rectangleEmptyDraw(int width, int height)
	{
		System.out.println("\n");
		for(int i = 0; i < height; i++)
		{
			for(int j = 0; j < width; j++)
			{
				if(i==0 || i== height-1)
				{
					System.out.print(" * ");
					continue;
				}
				if(j==0 || j == width-1)
				{
					System.out.print(" * ");
					
				}
				else{
					System.out.print("   ");
					//continue;
				}				
				
			}
			System.out.println("\n");
		}
	}
	void triangleDraw(int height)
	{
		System.out.println("\n");
		for(int i = 0; i < height; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print(" * ");
			}
			System.out.println("\n");
		}
	}
}
