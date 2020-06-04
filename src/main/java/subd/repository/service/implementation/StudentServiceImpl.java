package subd.repository.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import subd.repository.entity.Student;
import subd.repository.repository.StudentRepository;
import subd.repository.service.serviceInterfaces.StudentService;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student addStudent(Student student) {
        Student savedStudent = studentRepository.saveAndFlush(student);
        return savedStudent;
    }
    @Override
    public void delete(int id) {
        studentRepository.deleteById(id);
    }
    @Override
    public Optional<Student> getById(int id) {
        return studentRepository.findById(id);
    }
    @Override
    public Student editStudent(Student student) {
        return studentRepository.saveAndFlush(student);
    }
    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }
}
