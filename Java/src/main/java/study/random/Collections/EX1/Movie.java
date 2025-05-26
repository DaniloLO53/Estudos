package study.random.Collections.EX1;

public class Movie extends ItemMedia {
    private Genre genre;
    private Rating rating;

    public Movie(String name, Double price, Genre genre, Rating rating) {
        super(name, price);
        this.genre = genre;
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                ", genre=" + genre +
                ", rating=" + rating +
                '}';
    }
}
