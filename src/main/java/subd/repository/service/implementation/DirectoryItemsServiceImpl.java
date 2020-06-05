package subd.repository.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import subd.repository.entity.DirectoryItems;
import subd.repository.model.OffsetablePageRequest;
import subd.repository.repository.DirectoryItemsRepository;
import subd.repository.service.serviceInterfaces.DirectoryItemsService;

import java.util.List;
import java.util.Optional;

@Service
public class DirectoryItemsServiceImpl implements DirectoryItemsService {
    @Autowired
    private DirectoryItemsRepository directoryItemsRepository;
    @Override
    public DirectoryItems adddirectoryItems(DirectoryItems directoryItems) {
        DirectoryItems saveddirectoryItems = directoryItemsRepository.saveAndFlush(directoryItems);
        return saveddirectoryItems;
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
    public DirectoryItems editdirectoryItems(DirectoryItems directoryItems) {
        return directoryItemsRepository.saveAndFlush(directoryItems);
    }
    @Override
    public List<DirectoryItems> getAll() {
        return directoryItemsRepository.findAll();
    }
    @Override
    public List<DirectoryItems> getAll(int offset,int count){
        return directoryItemsRepository.findAll(new OffsetablePageRequest(offset,count)).toList();
    }
}
