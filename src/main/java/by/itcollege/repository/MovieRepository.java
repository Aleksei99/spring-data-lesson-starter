package by.itcollege.repository;

import by.itcollege.entity.Genre;
import by.itcollege.entity.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie,Long> {
    Movie findMovieByName(String name);
    List<Movie> findMovieByGenre(Genre genre);
    List<Movie> findMovieByGenreIn(List<Genre> genres);
    Movie findMovieByNameAndDirector_LastName(String movieName,String directorLastName);
    List<Movie> findMovieByReleaseYearBetween(int firstYear, int lastYear);
    Movie findMovieByNameIsContaining(String partName);
}
