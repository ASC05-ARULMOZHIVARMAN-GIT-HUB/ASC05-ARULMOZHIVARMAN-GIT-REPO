package lab3;

public class Movie {
    private static String movieName;
    private String producedBy;
    private String directedBy;
    private int duration;
    private int year;
    private String category;

    // Constructor with mandatory fields only
    public Movie(String movieName, String producedBy) {
        if (movieName == null || producedBy == null) {
            throw new IllegalArgumentException("movieName and producedBy are mandatory");
        }
        this.movieName = movieName;
        this.producedBy = producedBy;
    }

    // Full constructor calling the mandatory constructor using this()
    public Movie(String movieName, String producedBy, String directedBy, int duration, int year, String category) {
        this(movieName, producedBy);  // calling mandatory constructor
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    // Methods to accept and display information (setters and getters)
    public static String getMovieName() { return movieName; }
    public String getProducedBy() { return producedBy; }
    public String getDirectedBy() { return directedBy; }
    public void setDirectedBy(String directedBy) { this.directedBy = directedBy; }
    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

	public String showDetails() {
		// TODO Auto-generated method stub
		return null;
	}
}

