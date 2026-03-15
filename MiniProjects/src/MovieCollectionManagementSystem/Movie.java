package MovieCollectionManagementSystem;

public class Movie {
    private String title;
    private String director;
    private double rating;

    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    public void displayDetails() {
        System.out.println(title + " (" + director + "), Rating: " + rating);
    }

    public String getDirector() {
        return director;
    }

    public double getRating() {
        return rating;
    }
}