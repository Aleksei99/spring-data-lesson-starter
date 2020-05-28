package by.itcollege.repository;

import by.itcollege.entity.Director;
import by.itcollege.entity.Genre;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DirectorRepository extends CrudRepository<Director,Long> {
    Director findDirectorByFirstNameAndLastName(String firstName, String lastName);
    List<Director> findDirectorsByMoviesGenre(Genre genre);
}
