package study.random.Collections.EX1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Clube da Luta", 15.32, Genre.ACTION, Rating.FREE);
        Movie movie2 = new Movie("Matrix Revolutions", 11.87, Genre.DRAMA, Rating.PLUS_12);
        Movie movie3 = new Movie("Interestelar", 18.45, Genre.FICTION, Rating.PLUS_18);
        Movie movie4 = new Movie("A Origem", 10.50, Genre.HORROR, Rating.PLUS_14);
        Movie movie5 = new Movie("O Poderoso Chefão", 19.91, Genre.KOREAN, Rating.PLUS_16);
        Movie movie6 = new Movie("Pulp Fiction: Tempo de Violência", 14.03, Genre.THRILLER, Rating.PLUS_18);
        Movie movie7 = new Movie("Forrest Gump: O Contador de Histórias", 17.66, Genre.ACTION, Rating.FREE);
        Movie movie8 = new Movie("Cidade de Deus", 9.99, Genre.DRAMA, Rating.PLUS_16);
        Movie movie9 = new Movie("O Silêncio dos Inocentes", 12.30, Genre.FICTION, Rating.PLUS_18);
        Movie movie10 = new Movie("Gladiador", 16.75, Genre.THRILLER, Rating.PLUS_16);
        Movie movie11 = new Movie("O Resgate do Soldado Ryan", 13.21, Genre.KOREAN, Rating.PLUS_14);
        Movie movie12 = new Movie("A Lista de Schindler", 19.05, Genre.THRILLER, Rating.PLUS_16);
        Movie movie13 = new Movie("Vingadores: Ultimato", 11.11, Genre.ACTION, Rating.FREE);
        Movie movie14 = new Movie("Coringa", 10.01, Genre.ACTION, Rating.PLUS_12);
        Movie movie15 = new Movie("Parasita", 14.88, Genre.HORROR, Rating.PLUS_18);

        Book book1 = new Book("O Senhor dos Anéis: A Sociedade do Anel", 16.82, "Someone1");
        Book book2 = new Book("Harry Potter e a Pedra Filosofal", 10.47, "Someone2");
        Book book3 = new Book("1984", 19.01, "Someone3");
        Book book4 = new Book("Admirável Mundo Novo", 11.75, "Someone4");
        Book book5 = new Book("O Pequeno Príncipe", 15.33, "Someone5");
        Book book6 = new Book("Dom Quixote de la Mancha", 13.99, "Someone6");
        Book book7 = new Book("Crime e Castigo", 17.20, "Someone5");
        Book book8 = new Book("Orgulho e Preconceito", 18.64, "Someone1");
        Book book9 = new Book("O Sol é Para Todos", 10.05, "Someone3");
        Book book10 = new Book("Cem Anos de Solidão", 14.50, "Someone7");
        Book book11 = new Book("A Revolução dos Bichos", 12.88, "Someone3");
        Book book12 = new Book("O Apanhador no Campo de Centeio", 11.12, "Someone8");
        Book book13 = new Book("O Leão, a Feiticeira e o Guarda-Roupa", 19.76, "Someone7");
        Book book14 = new Book("O Hobbit", 16.03, "Someone2");
        Book book15 = new Book("Fahrenheit 451", 13.25, "Someone9");

        List<Movie> movies = List.of(movie1, movie2,movie3,movie4,movie5,movie6,movie7,movie8,movie9,movie10,movie11,movie12,movie13,movie14,movie15);
        List<Book> books = List.of(book1, book2,book3,book4,book5,book6,book7,book8,book9,book10,book11,book12,book13,book14,book15);

        System.out.println(setMoviesByGenre(movies));
    }

    public static Map<String, List<Movie>> setMoviesByGenre(List<Movie> movies) {
        Map<String, List<Movie>> moviesByGenre = new HashMap<>();
        List<Movie> actionMovies = new ArrayList<>();
        List<Movie> thrillerMovies = new ArrayList<>();
        List<Movie> dramaMovies = new ArrayList<>();
        List<Movie> koreanMovies = new ArrayList<>();
        List<Movie> horrorMovies = new ArrayList<>();
        List<Movie> fictionMovies = new ArrayList<>();

        for (Movie movie : movies) {
            switch (movie.getGenre()) {
                case HORROR: {
                    horrorMovies.add(movie);
                    break;
                }
                case FICTION: {
                    fictionMovies.add(movie);
                    break;
                }
                case DRAMA: {
                    dramaMovies.add(movie);
                    break;
                }
                case THRILLER: {
                    thrillerMovies.add(movie);
                    break;
                }
                case KOREAN: {
                    koreanMovies.add(movie);
                    break;
                }
                case ACTION: {
                    actionMovies.add(movie);
                    break;
                }
                default: {
                    break;
                }
            }
        }

        moviesByGenre.put("ACTION", actionMovies);
        moviesByGenre.put("HORROR", horrorMovies);
        moviesByGenre.put("FICTION", fictionMovies);
        moviesByGenre.put("DRAMA", dramaMovies);
        moviesByGenre.put("KOREAN", koreanMovies);
        moviesByGenre.put("THRILLER", thrillerMovies);

        return moviesByGenre;
    }
}
