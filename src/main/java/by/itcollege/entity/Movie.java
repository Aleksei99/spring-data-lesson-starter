package by.itcollege.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "movies")
@ToString
public class Movie extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Column(name = "release_year")
    private int releaseYear;

    @ManyToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name = "director_id")
    private Director director;
}
