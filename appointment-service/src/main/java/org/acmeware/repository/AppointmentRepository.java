package org.acmeware.repository;

import org.acmeware.entity.Appointment;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepositoryImplementation<Appointment, Long> {
}
