package by.hector.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author i.sukach
 */
@Entity
@Table(name = "movies")
@Data
public class Movie extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "release_year")
    private int releaseYear;

    @Enumerated(EnumType.STRING)
    @Column(name = "genre")
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "director_id")
    private Director director;
}
