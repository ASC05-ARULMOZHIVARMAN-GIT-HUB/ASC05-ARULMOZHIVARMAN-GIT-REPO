package lab4;

public class SpecialMovie extends Movie {
    private String specialEffect;

    public SpecialMovie(String title, String director, String specialEffect) {
        super(title, director);
        this.specialEffect = specialEffect;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Special Effect: " + specialEffect);
    }

    public void showSpecialFeature() {
        System.out.println("Feature: Behind the scenes commentary.");
    }
}
