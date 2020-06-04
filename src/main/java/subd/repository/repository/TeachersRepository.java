package subd.repository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import subd.repository.entity.Teachers;
import java.util.List;

@Repository
public interface TeachersRepository extends JpaRepository<Teachers, Integer> {
    @Query("Select new subd.repository.repository.TeachersgetByTelefon(t.id,t.surname,t.name,t.middle_name,t.academic_subjects,t.telephone) from Teachers t order by t.telephone desc ")
    List<TeachersgetByTelefon> Teachers();
}
