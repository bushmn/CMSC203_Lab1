import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
Movie movie = new Movie();
boolean again = true;

do {

	System.out.println("Enter the name of a movie");
	String movieName = input.nextLine();
	movie.setTitle(movieName);
	
	System.out.println("Enter the rating of the movie");
	String rating = input.nextLine();
	movie.setRating(rating);
	
	System.out.println("Enter the number of tickets sold for this movie");
	int tickets = input.nextInt();
	movie.setSoldTickets(tickets);
	
	System.out.println(movie.toString());
	
	System.out.println("Do you want to enter in another (yes or no)");
	String userAnswer = input.next();

	
	if (userAnswer.equals("yes")) {
		again = true;
		 main(args);
	
	if (userAnswer.equals("no")) {
		again = false;
		
	}
  }

}

while (again == false);
System.out.println("Goodbye");
System.exit(0);

}
}
