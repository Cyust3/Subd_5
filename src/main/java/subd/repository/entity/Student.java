package subd.repository.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String surname;

    private String name;

    private String middleName;

    private String telephone;

    @ManyToOne
    private Academicgroup academicgroup;

    @OneToMany
    private List<AcademicPerformance> academicperformances;


    @Override
    public String toString() {
        return "Ad {\n" +
                " id=" + id + ",\n" +
                " surname=" + surname + ",\n" +
                " name=" + name + ",\n" +
                " middleName=" + middleName + ",\n" +
                " telephone=" + telephone + ",\n" +
                "}" + "\n";
    }
}
