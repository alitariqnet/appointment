package org.acmeware.repository;

import org.acmeware.entity.Organization;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface OrganizationRepository extends JpaRepositoryImplementation<Organization, Long> {
}
