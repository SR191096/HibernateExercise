import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


@Entity
@Table (name= "Author")
public class Author {

    @Id
    @GeneratedValue (strategy = GenerationType.TABLE)
    @Column (name = "Author_Id")
    private Integer id;
    @Column (name = "Author_fname")
    private String firstName;
    @Column (name = "Author_lname")
    @Transient
    private String lastName;
    @Column (name = "Author_age")
    private Integer age;
    @Temporal (TemporalType.TIMESTAMP)
    @Column (name = "Author_dob")
    private Date dob;

    @Embedded
    private Address address;

    @ElementCollection
    List<String> subjects = new ArrayList<>();

    public List<String> getSubjects() {
        return subjects;
    }

    @ManyToMany
    private Collection<Book> book = new ArrayList<>();

    public Collection<Book> getBook() {
        return book;
    }

    public void setBook(Collection<Book> book) {
        this.book = book;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
