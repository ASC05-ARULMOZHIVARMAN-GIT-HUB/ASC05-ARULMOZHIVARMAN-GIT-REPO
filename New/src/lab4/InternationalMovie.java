package lab4;

public class InternationalMovie extends Movie {
    private String language;
    private String country;

    public InternationalMovie(String title, String director, String language, String country) {
        super(title, director);
        this.language = language;
        this.country = country;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Language: " + language);
        System.out.println("Country: " + country);
    }

    public void subtitleInfo() {
        System.out.println("Subtitles available in English.");
    }
}
