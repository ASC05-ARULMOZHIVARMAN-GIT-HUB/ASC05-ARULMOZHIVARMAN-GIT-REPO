package lab3;

public class Main {
    public static void main(String[] args) {
        // Creating a Movie object using mandatory constructor
        Movie m1 = new Movie("Hello", "XYZ Productions");
        System.out.println(m1.getMovieName()); // Output: Hello_1
        System.out.println(m1.showDetails());

        // Creating a Movie object using full constructor
        Movie m2 = new Movie("Star Wars", "Lucasfilm", "George Lucas", 121, 1977, "Action");
        System.out.println(m2.getMovieName()); // Output: Star Wars_2
        System.out.println(m2.showDetails());

        // Creating a SpecialMovie object
        SpecialMovie sm = new SpecialMovie("Avengers", "Marvel Studios", "Joss Whedon", 143, 2012, "Action",
                                           "Dolby Atmos", "CGI");
        System.out.println(sm.getMovieName());  // Avengers_3
        System.out.println(sm.showDetails());

        // Creating an InternationalMovie object
        InternationalMovie im = new InternationalMovie("Parasite", "Barunson E&A", "Bong Joon-ho", 132, 2019, "Thriller",
                                                       "South Korea", "Korean");
        System.out.println(im.getMovieName());  // Parasite_4
        System.out.println(im.showDetails());

        // Display total movies count
        System.out.println("Total movies created: " + Movie.getMovieName()); // 4
    }
}