package subd.repository.service.serviceInterfaces;

import org.springframework.stereotype.Service;
import subd.repository.entity.Teachers;
import java.util.List;
import java.util.Optional;

@Service
public interface TeachersService {
    Teachers addteachers(Teachers teachers);
    void delete(int id);
    Optional<Teachers> getById(int id);
    Teachers editteachers(Teachers teachers);
    List<Teachers> getAll();
}
