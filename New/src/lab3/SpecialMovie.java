package lab3;

class SpecialMovie extends Movie {
    private String soundEffectsTechnology;
    private String visualEffectsTechnology;

    // Constructor with mandatory and special attributes
    public SpecialMovie(String movieName, String producedBy, String directedBy, int duration, int year,
                        String category, String soundEffectsTechnology, String visualEffectsTechnology) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.soundEffectsTechnology = soundEffectsTechnology;
        this.visualEffectsTechnology = visualEffectsTechnology;
    }

    // Setters for additional attributes
    public void setSoundEffectsTechnology(String soundEffectsTechnology) {
        this.soundEffectsTechnology = soundEffectsTechnology;
    }

    public void setVisualEffectsTechnology(String visualEffectsTechnology) {
        this.visualEffectsTechnology = visualEffectsTechnology;
    }

    // Show details including additional info
    @Override
    public String showDetails() {
        return super.showDetails() +
               ", Sound Effects Technology: " + (soundEffectsTechnology != null ? soundEffectsTechnology : "N/A") +
               ", Visual Effects Technology: " + (visualEffectsTechnology != null ? visualEffectsTechnology : "N/A");
    }
}