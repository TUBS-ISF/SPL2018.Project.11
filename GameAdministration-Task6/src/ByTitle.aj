import java.util.Comparator;

public aspect ByTitle{
	public static Comparator<Game> GameAdministration.getComparator(){
		return new TitleComparator();
	}
}