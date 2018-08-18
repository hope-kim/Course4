import java.util.Scanner;

public class powerTable {
	public static void main(String[] args) {
		
		// asking for user input
		System.out.print("Please enter number for last base (preferably under 7): ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int base = scan.nextInt();
		
		System.out.print("Please enter number for last power (preferably under 7): ");
		int power = scan.nextInt();
		
		// print table
		for(int i = 0; i <= base; i++)
		{
			System.out.print("\t " + i);
		}
		System.out.println("");
		for(int i = 0; i <= base; i++)
		{
			System.out.print("\t---");
		}
		System.out.println("");
		
		for(int i = 0; i <= base; i++)
		{
			System.out.print(i);
			for (int j = 0; j <= power; j++)
			{
				System.out.print("\t " + (int)Math.pow(i, j));
			}
			System.out.println("");
		}
	}
}
