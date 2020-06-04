package subd.repository.repository;

import subd.repository.entity.Academicgroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicgroupRepository extends JpaRepository<Academicgroup, Integer> {
}
