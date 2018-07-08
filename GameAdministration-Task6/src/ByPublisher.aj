import java.util.Comparator;

aspect ByPublisher {
	
	public static Comparator<Game> GameAdministration.getComparator(){
		return new PublisherComparator();
	}
}