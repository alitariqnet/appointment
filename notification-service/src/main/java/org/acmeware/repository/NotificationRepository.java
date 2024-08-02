package org.acmeware.repository;

import org.acmeware.entity.Notification;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface NotificationRepository extends JpaRepositoryImplementation<Notification, Long> {
}
