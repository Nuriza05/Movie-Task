import java.util.LinkedList;
import java.util.List;

public interface FindAble {
    void getAllMovies(LinkedList<Movie>movies);
    void findMovieByName(List<Movie>movies);
    void findMovieByActorName(List<Movie>movies);
    void findMovieByYear(List<Movie>movies);
    void findMovieByDirector(List<Movie>movies);
    void findMovieByDescription(List<Movie>movies);
    void findMovieByRole(List<Movie> movies);

}
