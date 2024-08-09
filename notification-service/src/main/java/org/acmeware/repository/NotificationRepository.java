package org.acmeware.repository;

import org.acmeware.entity.Notification;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepositoryImplementation<Notification, Long> {
}
