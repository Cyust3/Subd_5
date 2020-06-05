package subd.repository.service.serviceInterfaces;

import org.springframework.stereotype.Service;
import subd.repository.entity.AcademicPerformance;
import java.util.List;
import java.util.Optional;

@Service
public interface AcademicPerformanceService {
    AcademicPerformance addacademicPerfomance(AcademicPerformance academicPerformance);
    void delete(int id);
    Optional<AcademicPerformance> getById(int id);
    AcademicPerformance editacademicPerformance(AcademicPerformance academicPerformance);
    List<AcademicPerformance> getAll();
}
