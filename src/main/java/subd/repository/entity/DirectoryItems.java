package subd.repository.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class DirectoryItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String items;

    public void Constructor(Integer id, String items){
        this.id = id;
        this.items = items;
    }

    @OneToMany
    private List<AcademicPerformance> academicperformances;

    @Override
    public String toString() {
        return "Ad {\n" +
                " id=" + id + ",\n" +
                " items=" + items + ",\n" +
                "}" + "\n";
    }
}
