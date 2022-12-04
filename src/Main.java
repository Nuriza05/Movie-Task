import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Director d1 = new Director("DOUGLAS","MACKINNON");
        Director d2 = new Director("SOME","DIRECTOR");
        Director d3 = new Director("HAPPY","GUY");
        Director d4 = new Director("PETER","JACKSON");
        Director d5 = new Director("ANTHONY","RUSSO");
        Director d6 = new Director("PAUL","MCGUIANA");

        List<Cast> casts1 = new LinkedList<>();
        casts1.add(new Cast("DAVID TENANT","CROWLEY"));
        casts1.add(new Cast("DANIEL MAYS","ARTHUR YOUNG"));
        casts1.add(new Cast("NED DENNEHY","HASTUR"));

        List<Cast> casts2 = new LinkedList<>();
        casts2.add(new Cast("ORLANDO BLOOM","PHILO"));
        casts2.add(new Cast("CARA DELEVINGNE","VIGNETTE STONEMOSS"));
        casts2.add(new Cast("SIMON MCBURNEY","RUNYON MILLWORTHY"));

        List<Cast> casts3 = new LinkedList<>();
        casts3.add(new Cast("DANIEL RADCLIFFE","HARRY POTTER"));
        casts3.add(new Cast("EMMA WATSON","HERMIONE GRANGER"));
        casts3.add(new Cast("RUPERT GRINT","RON WEASLEY"));

        List<Cast> casts4 = new LinkedList<>();
        casts4.add(new Cast("LEE PASE","THRANDIUL"));
        casts4.add(new Cast("MARTIN FREEMAN","BILBO BAGGINS"));
        casts4.add(new Cast("ORLANDO BLOOM","LEGOLAS"));

        List<Cast> casts5 = new LinkedList<>();
        casts5.add(new Cast("MARTIN FREEMAN","BILBO BAGGINS"));
        casts5.add(new Cast("RICHARD ARMITAGE","THORIN"));
        casts5.add(new Cast("EVANGELINE LILLY","TAURIEL"));

        List<Cast> casts6 = new LinkedList<>();
        casts6.add(new Cast("CHRIS HEMS WORTH","THOR"));
        casts6.add(new Cast("MARK RUFFALO","HULK"));
        casts6.add(new Cast("ROBERT DOWNEY","TONY STARK"));

        List<Cast> casts7 = new LinkedList<>();
        casts7.add(new Cast("BENEDICT CUMBERBATCH","SHERLOCK HOLMES"));
        casts7.add(new Cast("UNA STUBS","MRS HUDSON"));
        casts7.add(new Cast("MARTIN FREEMAN","DR. WATSON"));


        Movie movie1 = new Movie("GOOD OMENS",2019,"TV SERIES",d1,casts1);
        Movie movie2 = new Movie("CARNIVAL ROW",2019,"TV SERIES",d2,casts2);
        Movie movie3 = new Movie("HARRY POTTER",2005,"MOVIE",d3,casts3);
        Movie movie4 = new Movie("THE HOBBIT: THE DESOLATION OF SMAUG",2013,"MOVIE",d4,casts4);
        Movie movie5 = new Movie("THE HOBBIT: THE BATTLE OF THE FIVE ARMIES",2014,"MOVIE",d4,casts5);
        Movie movie6 = new Movie("AVENGERS: ENDGAME",2019,"MOVIE",d5,casts6);
        Movie movie7 = new Movie("SHERLOCK: SEASON 1",2010,"TV SERIES",d6,casts7);

        LinkedList<Movie> movies = new LinkedList<>(Arrays.asList(movie1,movie2,movie3,movie4,movie5,movie6,movie7));

        while (true){
           Movie movie = new Movie();
            System.out.println("""
                                 ================Commands==================
                                 Press 1 to print catalog
                                 Press 2 to find a movie by full or part name
                                 Press 3 to sort by year
                                 Press 4 to sort by director
                                 Press 5 to sort by name
                                 Press 6 to find movies by actor's name
                                 Press 7 to find movies by director's name
                                 Press 8 to find movies by year
                                 Press 9 to find movies by description
                                 Press 10 to find movies by role
                                 ===========================================
                                 """);
            int number = new Scanner(System.in).nextInt();
            switch (number) {
                case 1: System.out.println("~~~~~~~~~~~All movies~~~~~~~~");
                    movie.getAllMovies(movies);
                    break;
                case 2:System.out.print("Write the movie's name: ");
                    movie.findMovieByName(movies);  break;
                case 3: System.out.println("1. Ascending "+
                                           "2. Descending");
                    int input1 = new Scanner(System.in).nextInt();
                    if(input1==1){
                        movie.sortByYearAscending(movies);
                    } else if (input1==2) {
                        movie.sortByYearDescending(movies);
                    }break;
                case 4: movie.sortByDirector(movies); break;
                case 5: System.out.println("1. -from A to Z\n" +
                                          "2. -from Z to A\n");
                    int input = new Scanner(System.in).nextInt();
                    if(input==1){
                        movie.sortByMovieNameAToZ(movies);
                    } else if (input==2) {
                        movie.sortByMovieNameZToA(movies);
                    }  break;
                case 6: System.out.print("Write the actor's name: ");
                        movie.findMovieByActorName(movies);
                    break;
                case 7: System.out.print("Write the director's name: ");
                        movie.findMovieByDirector(movies);
                    break;
                case 8: System.out.print("Write the year of movie: ");
                        movie.findMovieByYear(movies);
                    break;
                case 9: System.out.print("Write the  description of movie: ");
                        movie.findMovieByDescription(movies);
                    break;
                case 10:System.out.print("Write the cast's name: ");
                        movie.findMovieByRole(movies);
                    break;
            }
            }
        }







}