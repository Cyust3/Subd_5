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

    private String middle_name;

    private String academic_subjects;

    private String telephone;

    @OneToMany
    private List<Academicgroup> academicgroups;

    @Override
    public String toString() {
        return "Ad {\n" +
                " id=" + id + ",\n" +
                " surname=" + surname + ",\n" +
                " name=" + name + ",\n" +
                " middle_name=" + middle_name + ",\n" +
                " academic_subjects=" + academic_subjects + "\n" +
                " telephone=" + telephone + ",\n" +
                "}" + "\n";
    }
}
