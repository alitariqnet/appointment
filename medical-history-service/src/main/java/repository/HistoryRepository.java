package repository;

import entity.History;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends JpaRepositoryImplementation<History, Long> {
}
