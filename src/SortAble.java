import java.util.List;

public interface SortAble {
     void sortByMovieNameAToZ(List<Movie> movies);
     void sortByMovieNameZToA(List<Movie> movies);

     void sortByDirector(List<Movie> movies);

     void sortByYearAscending(List<Movie> movies);
     void sortByYearDescending(List<Movie> movies);
}
