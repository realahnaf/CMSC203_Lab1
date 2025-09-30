import java.util.Scanner;

public class MovieDriver_Task1 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		Movie movie = new Movie();
		
		System.out.print("Enter the name of a movie: ");
		movie.setTitle(keyboard.nextLine());
		keyboard.nextLine();
		
		System.out.print("Enter the rating of the movie: ");
		movie.setRating(keyboard.nextLine());
		keyboard.nextLine();
		
		System.out.print("Enter the number of tickets sold for this movie: ");
		movie.setSoldTickets(keyboard.nextInt());
		
		System.out.print("\n");
		
		System.out.println(movie.toString());
	}

}
