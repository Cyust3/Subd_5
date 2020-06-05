package subd.repository.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Teachers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String surname;

    private String name;

    private String middleName;

    private String academicSubjects;

    private String telephone;

    @OneToMany
    private List<Academicgroup> academicgroups;

    @Override
    public String toString() {
        return "Ad {\n" +
                " id=" + id + ",\n" +
                " surname=" + surname + ",\n" +
                " name=" + name + ",\n" +
                " middleName=" + middleName + ",\n" +
                " academicSubjects=" + academicSubjects + "\n" +
                " telephone=" + telephone + ",\n" +
                "}" + "\n";
    }
}
