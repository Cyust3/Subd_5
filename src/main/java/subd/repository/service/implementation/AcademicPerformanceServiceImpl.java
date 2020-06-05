package subd.repository.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import subd.repository.entity.AcademicPerformance;
import subd.repository.repository.AcademicPerformanceRepository;
import subd.repository.service.serviceInterfaces.AcademicPerformanceService;
import java.util.List;
import java.util.Optional;

@Service
public class AcademicPerformanceServiceImpl implements AcademicPerformanceService {
    @Autowired
    private AcademicPerformanceRepository academicPerformanceRepository;
    @Override
    public AcademicPerformance addacademicPerfomance(AcademicPerformance academicPerformance) {
        AcademicPerformance savedacademicPerformance = academicPerformanceRepository.saveAndFlush(academicPerformance);
        return savedacademicPerformance;
    }
    @Override
    public void delete(int id) {
        academicPerformanceRepository.deleteById(id);
    }
    @Override
    public Optional<AcademicPerformance> getById(int id) {
        return academicPerformanceRepository.findById(id);
    }
    @Override
    public AcademicPerformance editacademicPerformance(AcademicPerformance academicPerformance) {
        return academicPerformanceRepository.saveAndFlush(academicPerformance);
    }
    @Override
    public List<AcademicPerformance> getAll() {
        return academicPerformanceRepository.findAll();
    }
}
