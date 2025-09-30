import java.util.Scanner;

public class MovieDriver_Task2 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Movie movie = new Movie();
		String enterAgain = "";
		boolean shouldRun = true;
		
		while (shouldRun)
		{
			System.out.print("Enter the name of a movie: ");
			movie.setTitle(keyboard.nextLine());
			
			System.out.print("Enter the rating of the movie: ");
			movie.setRating(keyboard.nextLine());
			
			System.out.print("Enter the number of tickets sold for this movie: ");
			movie.setSoldTickets(keyboard.nextInt());
			keyboard.nextLine();
			
			System.out.print("\n");
			
			System.out.println(movie.toString());
			
			do
			{
				System.out.print("\nDo you want to enter again?(y or n): ");
				enterAgain = keyboard.nextLine();
				System.out.print("\n");
				
				if (enterAgain.equalsIgnoreCase("n"))
				{
					shouldRun = false;
					
					System.out.println("Goodbye!");
				}
				
			} while (!enterAgain.equalsIgnoreCase("y") && !enterAgain.equalsIgnoreCase("n"));
		}
	}
}
