package lab4;

public class Movie {
    protected String title;
    protected String director;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
    }
}
