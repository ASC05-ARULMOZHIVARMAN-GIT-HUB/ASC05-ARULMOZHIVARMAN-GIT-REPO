package lab4;

public class MovieTest {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];

        movies[0] = new Movie("Inception", "Christopher Nolan");
        movies[1] = new SpecialMovie("Avatar", "James Cameron", "3D Visuals");
        movies[2] = new InternationalMovie("Parasite", "Bong Joon-ho", "Korean", "South Korea");

        System.out.println("=== Movie Details ===");
        for (Movie m : movies) {
            m.showDetails();  // runtime polymorphism

            // Typecasting to access subclass-specific methods
            if (m instanceof SpecialMovie) {
                ((SpecialMovie) m).showSpecialFeature();
            } else if (m instanceof InternationalMovie) {
                ((InternationalMovie) m).subtitleInfo();
            }

            System.out.println("----------------------");
        }
    }
}
