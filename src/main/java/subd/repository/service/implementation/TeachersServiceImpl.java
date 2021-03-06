package subd.repository.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import subd.repository.entity.Teachers;
import subd.repository.model.OffsetablePageRequest;
import subd.repository.repository.TeachersRepository;
import subd.repository.service.serviceInterfaces.TeachersService;

import java.util.List;
import java.util.Optional;

@Service
public class TeachersServiceImpl implements TeachersService {
    @Autowired
    private TeachersRepository teachersRepository;
    @Override
    public Teachers addteachers(Teachers teachers) {
        Teachers savedteachers = teachersRepository.saveAndFlush(teachers);
        return savedteachers;
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
    public Teachers editteachers(Teachers teachers) {
        return teachersRepository.saveAndFlush(teachers);
    }
    @Override
    public List<Teachers> getAll() {
        return teachersRepository.findAll();
    }
    @Override
    public List<Teachers> getAll(int offset,int count){
        return teachersRepository.findAll(new OffsetablePageRequest(offset,count)).toList();
    }
}
