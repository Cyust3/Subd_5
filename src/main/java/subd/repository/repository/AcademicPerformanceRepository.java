package subd.repository.repository;

import subd.repository.entity.AcademicPerformance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AcademicPerformanceRepository extends JpaRepository<AcademicPerformance, Integer> {
}
