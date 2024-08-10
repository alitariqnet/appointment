package org.acmeware.service;

import org.acmeware.entity.Organization;
import org.acmeware.repository.OrganizationRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrganizationService {

    private OrganizationRepository organizationRepository;

    public OrganizationService(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    public Organization save(Organization organization){
        return organizationRepository.save(organization);
    }

    public Organization findById(Long id){
        Optional<Organization> organization = organizationRepository.findById(id);
        return organization.get();
    }

}
