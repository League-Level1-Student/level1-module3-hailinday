package _05_netflix;

import java.util.ArrayList;

// System.out.println();
// JOptionPane.showMessageDialog();
public class netflix {
	public static void main(String args [] ) {
		NetflixQueue netflix = new NetflixQueue();
		Movie movie1 = new Movie("Potato", 10);
		Movie movie2 = new Movie("Orange", 8);
		Movie movie3 = new Movie("Burger", 5);
		Movie movie4 = new Movie("Tomato", 7);
		Movie movie5 = new Movie("Grass", 2);
		movie1.getTicketPrice();
		netflix.addMovie(movie1);
		netflix.addMovie(movie2);
		netflix.addMovie(movie3);
		netflix.addMovie(movie4);
		netflix.addMovie(movie5);
		netflix.sortMoviesByRating();
		netflix.printMovies();
		System.out.println("The best movie is " + netflix.getBestMovie());
		System.out.println("The second best movie is " + netflix.getMovie(1));
	}
}
