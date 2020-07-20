package com.crm.crm.repository;

import com.crm.crm.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ContactRepository  extends CrudRepository<Contact,Long> {

}
