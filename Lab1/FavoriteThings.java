public class FavoriteThings{
	public static void main(String[] args){
		System.out.println("The Best Movies Ever:");
		String[] bestMovies = {"October Sky", "You've Got Mail", "Logan Lucky"};

		for (int i = 0; i < bestMovies.length; i++){
			System.out.println((i + 1) + ". " + bestMovies[i]);
		}
	}
}