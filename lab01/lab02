import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class palindrome {
	
	// isPalindrome method to determine if user input is palindrome
	static boolean isPalindrome(String word) {

		// ignores case
		String lowerCase = word.toLowerCase();
		int i = 0;
		int j = word.length()-1;

		// compares opposite ends of word
		while(i < j)
		{
			if (lowerCase.charAt(i) != lowerCase.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		// repeat game
		boolean keepGoing = true;
		
		while (keepGoing)
		{
			// asking for user input
			System.out.println("Welcome to the palindrome program.");
			System.out.print("Enter a word: ");

			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

			String word = buff.readLine();
			
			// determines if word is palindrome with output
			int choice = 0;
			boolean pal = isPalindrome(word);

			
			if (pal == true)
			{
				choice = 1;
			}
			else if (pal == false)
			{
				choice = 2;
			}
			
			
			switch(choice) {
			case 1:
				System.out.println(word + " IS a palindrome!");
				break;
			case 2: 
				System.out.println(word + " is not a palindrome.");
				break;
				default: 
					break;
			}
			System.out.println("");
			
			
			// continue game or not
			System.out.print("Would you like to go again (y/n): ");


			Scanner scan = new Scanner(System.in);
			
			
			String answer = scan.nextLine();
			System.out.println("");
			
			if (answer.equalsIgnoreCase("n"))
			{
				System.out.println("Quitting!");
				keepGoing = false;
			}		
		}		
	}
}
