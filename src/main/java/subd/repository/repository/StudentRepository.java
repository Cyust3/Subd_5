package subd.repository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import subd.repository.entity.Student;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query("Select new subd.repository.repository.StudentRating(st.surname,st.name,st.middle_name,ap.rating) from Student st JOIN AcademicPerformance ap on ap.stuent=st where ap.rating = '5'")
    List<StudentRating> studets();
}
