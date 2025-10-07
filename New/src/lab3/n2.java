package lab3;

class InternationalMovie extends Movie {
    private String country;
    private String language;

    // Constructor
    public InternationalMovie(String movieName, String producedBy, String directedBy, int duration, int year,
                              String category, String country, String language) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.country = country;
        this.language = language;
    }

    // Setters
    public void setCountry(String country) {
        this.country = country;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    // Show details including additional info
    @Override
    public String showDetails() {
        return super.showDetails() +
               ", Country: " + (country != null ? country : "N/A") +
               ", Language: " + (language != null ? language : "N/A");
    }
}
