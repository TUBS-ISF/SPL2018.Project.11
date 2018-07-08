import java.util.Comparator;

aspect ByTitle{
	public static Comparator<Game> GameAdministration.getComparator(){
		return new TitleComparator();
	}
}