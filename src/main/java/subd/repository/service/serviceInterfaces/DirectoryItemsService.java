package subd.repository.service.serviceInterfaces;

import org.springframework.stereotype.Service;
import subd.repository.entity.DirectoryItems;
import java.util.List;
import java.util.Optional;

@Service
public interface DirectoryItemsService {
    DirectoryItems adddirectoryItems(DirectoryItems directoryItems);
    void delete(int id);
    Optional<DirectoryItems> getById(int id);
    DirectoryItems editdirectoryItems(DirectoryItems directoryItems);
    List<DirectoryItems> getAll();
}
