package subd.repository.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class AcademicPerformance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Timestamp data;

    private String rating;

    @ManyToOne
    private Student stuent;

    @ManyToOne
    private DirectoryItems directoryItems;

    @Override
    public String toString() {
        return "Ad {\n" +
                " id=" + id + ",\n" +
                " data=" + data + ",\n" +
                " rating=" + rating + ",\n" +
                "}" + "\n";
    }
}
