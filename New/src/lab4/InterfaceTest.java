package lab4;

public class InterfaceTest {
    public static void main(String[] args) {
        Downloadable song = new MusicFile("My Favorite Song");

        // Interface reference calling implemented methods
        song.download();
        song.play();

        // Typecast to access superclass method
        ((MusicFile) song).showInfo();
    }
}
