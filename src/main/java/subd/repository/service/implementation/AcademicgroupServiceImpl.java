package subd.repository.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import subd.repository.entity.Academicgroup;
import subd.repository.repository.AcademicgroupRepository;
import subd.repository.service.serviceInterfaces.AcademicgroupService;
import java.util.List;
import java.util.Optional;

@Service
public class AcademicgroupServiceImpl implements AcademicgroupService {
    @Autowired
    private AcademicgroupRepository academicgroupRepository;
    @Override
    public Academicgroup addAcademicgroup(Academicgroup academicgroup) {
        Academicgroup savedAcademicgroup = academicgroupRepository.saveAndFlush(academicgroup);
        return savedAcademicgroup;
    }
    @Override
    public void delete(int id) {
        academicgroupRepository.deleteById(id);
    }
    @Override
    public Optional<Academicgroup> getById(int id) {
        return academicgroupRepository.findById(id);
    }
    @Override
    public Academicgroup editAcademicgroup(Academicgroup academicgroup) {
        return academicgroupRepository.saveAndFlush(academicgroup);
    }
    @Override
    public List<Academicgroup> getAll() {
        return academicgroupRepository.findAll();
    }
}