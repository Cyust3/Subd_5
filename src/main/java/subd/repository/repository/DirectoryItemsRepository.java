package subd.repository.repository;

import subd.repository.entity.DirectoryItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectoryItemsRepository extends JpaRepository<DirectoryItems, Integer> {
}
