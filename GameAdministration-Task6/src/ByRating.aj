import java.util.Comparator;

aspect ByRating {
	
	public static Comparator<Game> GameAdministration.getComparator(){
		return new RatingComparator();
	}
}