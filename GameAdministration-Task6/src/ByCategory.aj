import java.util.Comparator;

aspect ByCategory {
	
	public static Comparator<Game> GameAdministration.getComparator(){
		return new CategoryComparator();
	}
}