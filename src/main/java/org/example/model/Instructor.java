package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "instructors")
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String firstname;
    private String Lastname;
    private String email;
    private int phonenumber;

    @ManyToMany(
            fetch = FetchType.EAGER)
    @JoinTable(name = "instructor_course",
            joinColumns = @JoinColumn(name = "instructor_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "course_id",referencedColumnName = "id"))
    private List<Course> courses = new ArrayList<>();

    public Instructor(String firstname, String lastname, String email, int phonenumber) {
        this.firstname = firstname;
        Lastname = lastname;
        this.email = email;
        this.phonenumber = phonenumber;
    }
    @Override
    public String toString() {
        return "Instructor{" +
                "firstname='" + firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber=" + phonenumber +
                '}';
    }
}




