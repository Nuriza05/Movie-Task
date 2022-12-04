import java.util.*;

public class Movie implements FindAble, SortAble, Comparable<Movie> {
    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> cast;

    public Movie(String name, int year, String description, Director director, List<Cast> cast) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.cast = cast;
    }

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return
                "Name: " + name + "\n" +
                        "Year: " + year + "\n" +
                        "Description: " + description + "\n" +
                        "Director: " + director + "\n" +
                        "Casts of " + name + " *\n" + cast + "\n";
    }

    @Override
    public void getAllMovies(LinkedList<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println(movie + "~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }

    @Override
    public void findMovieByName(List<Movie> movies) {
        String input = new Scanner(System.in).next();
        for (Movie movie : movies) {
            if (movie.getName().contains(input.toUpperCase()))
                System.out.println(movie);
        }
    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        String input = new Scanner(System.in).next();
        for (Movie movie : movies) {
            for (Cast cast : movie.getCast()) {
                if (cast.getActorFullName().contains(input.toUpperCase()))
                    System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        int input = new Scanner(System.in).nextInt();
        for (Movie movie : movies) {
            if (movie.getYear() == input)
                System.out.println(movie);
        }
    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        String input = new Scanner(System.in).next();
        for (Movie movie : movies) {
            if (movie.getDirector().getName().contains(input.toUpperCase()))
                System.out.println(movie);
            if (movie.getDirector().getLastName().contains(input.toUpperCase()))
                System.out.println(movie);
        }
    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {
        String input = new Scanner(System.in).next();
        for (Movie movie : movies) {
            if (movie.getDescription().contains(input.toUpperCase()))
                System.out.println(movie);
        }
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        String input = new Scanner(System.in).next();
        for (Movie movie : movies) {
            for (Cast cast : movie.getCast()) {
                if (cast.getRole().contains(input.toUpperCase()))
                    System.out.println(movie);
            }
        }
    }



    public static Comparator<Movie> sortMovieByNameZToA = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.name.compareTo(o1.name);
        }
    };

    public static Comparator<Movie> sortByDirectorName = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.director.getName().compareTo(o2.director.getName());
        }
    };

    public static Comparator<Movie> sortMovieByYearAscending = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.year - o2.year;
        }
    };

    public static Comparator<Movie> sortMovieByYearDescending = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.year - o1.year;
        }
    };

    @Override
    public int compareTo(Movie o) {
        return name.compareTo(o.name);
    }
    @Override
    public void sortByMovieNameAToZ(List<Movie> movies) {
        Collections.sort(movies);
        for (Movie movie : movies) {
            System.out.println(
                    "\nName = " + movie.name +
                            "\nDirector = " + movie.director +
                            "\nYear = " + movie.year +
                            "\nDescription = " + movie.description +
                            "\nCast = " + movie.getCast());
        }
    }
    @Override
    public void sortByMovieNameZToA(List<Movie> movies) {
        movies.sort(sortMovieByNameZToA);
        for (Movie movie : movies) {
            System.out.println(
                    "\nName = " + movie.name +
                            "\nDirector = " + movie.director +
                            "\nYear = " + movie.year +
                            "\nDescription = " + movie.description +
                            "\nCast = " + movie.getCast());
        }
    }
    @Override
    public void sortByDirector(List<Movie> movies) {
        movies.sort(sortByDirectorName);
        for (Movie movie : movies) {
            System.out.println(
                    "\nDirector = " + movie.director +
                            "\nName = " + movie.name +
                            "\nYear = " + movie.year +
                            "\nDescription = " + movie.description +
                            "\nCast = " + movie.getCast());
        }
    }
    @Override
    public void sortByYearAscending(List<Movie> movies) {
        movies.sort(sortMovieByYearAscending);
        for (Movie movie : movies) {
            System.out.println(
                    "\nYear = " + movie.year +
                            "\nName = " + movie.name +
                            "\nDirector = " + movie.director +
                            "\nDescription = " + movie.description +
                            "\nCast = " + movie.getCast());
        }
    }

    @Override
    public void sortByYearDescending(List<Movie> movies) {
        movies.sort(sortMovieByYearDescending);
        for (Movie movie : movies) {
            System.out.println(
                    "\nYear = " + movie.year +
                            "\nName = " + movie.name +
                            "\nDirector = " + movie.director +
                            "\nDescription = " + movie.description +
                            "\nCast = " + movie.getCast());
        }
    }
}



