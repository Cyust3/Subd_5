package subd.repository.service.serviceInterfaces;

import org.springframework.stereotype.Service;
import subd.repository.entity.Student;
import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {
    Student addstudent(Student student);
    void delete(int id);
    Optional<Student> getById(int id);
    Student editstudent(Student student);
    List<Student> getAll();
    List<Student> getAll(int offset,int count);
}
