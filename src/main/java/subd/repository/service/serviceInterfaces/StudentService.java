package subd.repository.service.serviceInterfaces;

import org.springframework.stereotype.Service;
import subd.repository.entity.Student;
import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {
    Student addStudent(Student student);
    void delete(int id);
    Optional<Student> getById(int id);
    Student editStudent(Student student);
    List<Student> getAll();
}
