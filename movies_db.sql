CREATE DATABASE IF NOT EXISTS movies_db;

USE movies_db;

DROP TABLE IF EXISTS movies;
DROP TABLE IF EXISTS directors;

CREATE TABLE directors (id BIGINT AUTO_INCREMENT, first_name VARCHAR(30), last_name VARCHAR(30), PRIMARY KEY (id));
CREATE TABLE movies (id BIGINT AUTO_INCREMENT, name VARCHAR(50), genre VARCHAR(15), release_year INT, director_id BIGINT, PRIMARY KEY (id), FOREIGN KEY (director_id) REFERENCES directors(id));

INSERT INTO directors (first_name, last_name) VALUES ('Christopher', 'Nolan');
INSERT INTO directors (first_name, last_name) VALUES ('David', 'Fincher');
INSERT INTO directors (first_name, last_name) VALUES ('Clint', 'Eastwood');
INSERT INTO directors (first_name, last_name) VALUES ('Ridley', 'Scott');

INSERT INTO movies (name, genre, release_year, director_id) VALUES ('Interstellar', 'SCIENCE_FICTION', 2014, 1);
INSERT INTO movies (name, genre, release_year, director_id) VALUES ('The Prestige', 'DRAMA', 2006, 1);
INSERT INTO movies (name, genre, release_year, director_id) VALUES ('Memento', 'DRAMA', 2000, 1);
INSERT INTO movies (name, genre, release_year, director_id) VALUES ('Inception', 'ACTION', 2010, 1);

INSERT INTO movies (name, genre, release_year, director_id) VALUES ('Seven', 'THRILLER', 1995, 2);
INSERT INTO movies (name, genre, release_year, director_id) VALUES ('Gone Girl', 'THRILLER', 2014, 2);
INSERT INTO movies (name, genre, release_year, director_id) VALUES ('Fight Club', 'DRAMA', 1999, 2);

INSERT INTO movies (name, genre, release_year, director_id) VALUES ('Gran Torino', 'DRAMA', 2008, 3);
INSERT INTO movies (name, genre, release_year, director_id) VALUES ('Million Dollar Baby', 'DRAMA', 2004, 3);
INSERT INTO movies (name, genre, release_year, director_id) VALUES ('Mystic River', 'THRILLER', 2003, 3);

INSERT INTO movies (name, genre, release_year, director_id) VALUES ('Gladiator', 'ACTION', 2000, 4);
INSERT INTO movies (name, genre, release_year, director_id) VALUES ('Alien', 'HORROR', 1979, 4);
INSERT INTO movies (name, genre, release_year, director_id) VALUES ('The Martian', 'COMEDY', 2015, 4);
INSERT INTO movies (name, genre, release_year, director_id) VALUES ('Blade Runner', 'SCIENCE_FICTION', 1982, 4);


