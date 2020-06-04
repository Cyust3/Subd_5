package subd.repository.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import subd.repository.entity.Teachers;
import subd.repository.repository.TeachersRepository;
import subd.repository.service.serviceInterfaces.TeachersService;
import java.util.List;
import java.util.Optional;

@Service
public class TeachersServiceImpl implements TeachersService {
    @Autowired
    private TeachersRepository teachersRepository;
    @Override
    public Teachers addTeachers(Teachers teachers) {
        Teachers savedTeachers = teachersRepository.saveAndFlush(teachers);
        return savedTeachers;
    }
    @Override
    public void delete(int id) {
        teachersRepository.deleteById(id);
    }
    @Override
    public Optional<Teachers> getById(int id) {
        return teachersRepository.findById(id);
    }
    @Override
    public Teachers editTeachers(Teachers teachers) {
        return teachersRepository.saveAndFlush(teachers);
    }
    @Override
    public List<Teachers> getAll() {
        return teachersRepository.findAll();
    }
}
