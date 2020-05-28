package by.itcollege.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author alexandergorovtsov
 */
@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "employees")
@ToString(callSuper = true)
public class Employee extends BaseEntity
{

    public Employee(String name, String lastName, Organization organization)
    {
        this.firstName = name;
        this.lastName = lastName;
        this.organization = organization;
    }

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;
}
