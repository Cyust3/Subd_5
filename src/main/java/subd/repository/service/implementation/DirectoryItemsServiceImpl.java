package subd.repository.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import subd.repository.entity.DirectoryItems;
import subd.repository.repository.DirectoryItemsRepository;
import subd.repository.service.serviceInterfaces.DirectoryItemsService;
import java.util.List;
import java.util.Optional;

@Service
public class DirectoryItemsServiceImpl implements DirectoryItemsService {
    @Autowired
    private DirectoryItemsRepository directoryItemsRepository;
    @Override
    public DirectoryItems addDirectoryItems(DirectoryItems directoryItems) {
        DirectoryItems savedDirectoryItems = directoryItemsRepository.saveAndFlush(directoryItems);
        return savedDirectoryItems;
    }
    @Override
    public void delete(int id) {
        directoryItemsRepository.deleteById(id);
    }
    @Override
    public Optional<DirectoryItems> getById(int id) {
        return directoryItemsRepository.findById(id);
    }
    @Override
    public DirectoryItems editDirectoryItems(DirectoryItems directoryItems) {
        return directoryItemsRepository.saveAndFlush(directoryItems);
    }
    @Override
    public List<DirectoryItems> getAll() {
        return directoryItemsRepository.findAll();
    }
}
