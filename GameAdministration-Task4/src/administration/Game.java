package administration;
public class Game {

	private String Title;
	private String Publisher;
	private String Category;
	private int Rating;

	public Game(String title, String publisher, String category, int rating) {
		Title = title;
		Publisher = publisher;
		Category = category;
		Rating = rating;
	}
	
	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public int getRating() {
		return Rating;
	}

	public void setRating(int rating) {
		Rating = rating;
	}
	
	public void printHead() {
		System.out.println("Title, Publisher, Category, Rating");
	}
	
	public void print() {
		System.out.println(Title + ", " + Publisher + ", " + Category + ", " + Rating);
	}
	
	public String toString() {
		return Title + "," + Publisher + "," + Category + "," + Rating;
	}
}
