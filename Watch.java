public class Watch {
	private int rating;
	private Person person;
	private Movie movie;
	
	public Watch(Person person, Movie movie, int rating)
	{
		this.person = person;
		this.movie = movie;
		this.rating = rating;
	}
}
