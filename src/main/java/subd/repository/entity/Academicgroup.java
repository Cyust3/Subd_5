package subd.repository.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Academicgroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String groupname;

    @ManyToOne
    private Teachers teachers;

    @OneToMany
    private List<Student> student;

    @Override
    public String toString() {
        return "Ad {\n" +
                " id=" + id + ",\n" +
                " groupname=" + groupname + ",\n" +
                "}" + "\n";
    }
}

