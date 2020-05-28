package by.itcollege.repository;

import by.itcollege.config.PersistenceConfig;
import by.itcollege.entity.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;

/**
 * @author alexandergorovtsov
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = PersistenceConfig.class)
public class RepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private OrganizationRepository organizationRepository;

    @Autowired
    private DirectorRepository directorRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Before
    public void initData() {
        final Organization organization = organizationRepository.save(new Organization("GoogleInc"));

        employeeRepository.save(new Employee("Alexander", "Gorovtsov", organization));
    }

    /*@Test
    public void test() {
        employeeRepository
                .findAllByOrganizationNameContaining("Google")
                .forEach(System.out::println);
    }*/

    @Test
    public void testFindOneEmployee() {
        employeeRepository.findOne(1L);
    }





    @Test
    public void test1(){
        Movie movie = movieRepository.findMovieByName("Memento");
        System.out.println(movie);
    }

    @Test
    public void test2(){
        Director director = directorRepository.findDirectorByFirstNameAndLastName("Clint","Eastwood");
        System.out.println(director);
    }

    @Test
    public void test3(){
        List<Movie> movies = movieRepository.findMovieByGenre(Genre.DRAMA);
        System.out.println(movies);
    }

    @Test
    public void test4(){
        List<Genre> genres = new ArrayList<>();
        genres.add(Genre.COMEDY);
        genres.add(Genre.DRAMA);
        List<Movie> movies = movieRepository.findMovieByGenreIn(genres);
        System.out.println(movies);
    }

    @Test
    public void test5(){
        Movie movie = movieRepository.findMovieByNameAndDirector_LastName("Memento","Nolan");
        System.out.println(movie);
    }

    @Test
    public void test6(){
        List<Movie> movies = movieRepository.findMovieByReleaseYearBetween(2000,2014);
        System.out.println(movies);
    }

    @Test
    public void test7(){
        Movie movie = movieRepository.findMovieByNameIsContaining("Stel");
        System.out.println(movie);
    }

    @Test
    public void test8(){
        List<Director> directors = directorRepository.findDirectorsByMoviesGenre(Genre.COMEDY);// not work
        System.out.println(directors);
    }

    @Test
    public void testOrganizations() {
        Organization itAcademy = organizationRepository
                .findByName("GoogleInc");
        System.out.println(itAcademy);

        List<String> strings = new ArrayList<>();
//        assertThat(strings, Matchers.containsInAnyOrder())
    }
}
