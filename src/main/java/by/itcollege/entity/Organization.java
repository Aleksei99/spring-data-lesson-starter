package by.itcollege.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author alexandergorovtsov
 */
@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "organizations")
@ToString(callSuper = true)
public class Organization extends BaseEntity {

    public Organization(String name)
    {
        this.name = name;
    }

    @Column(name = "name")
    private String name;
}
