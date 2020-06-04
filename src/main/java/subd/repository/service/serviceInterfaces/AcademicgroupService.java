package subd.repository.service.serviceInterfaces;

import org.springframework.stereotype.Service;
import subd.repository.entity.Academicgroup;
import java.util.List;
import java.util.Optional;

@Service
public interface AcademicgroupService {
    Academicgroup addAcademicgroup(Academicgroup academicgroup);
    void delete(int id);
    Optional<Academicgroup> getById(int id);
    Academicgroup editAcademicgroup(Academicgroup academicgroup);
    List<Academicgroup> getAll();
}
