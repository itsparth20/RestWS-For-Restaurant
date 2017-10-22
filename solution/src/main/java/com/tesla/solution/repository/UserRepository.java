package com.tesla.solution.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.tesla.solution.model.User;

@RepositoryRestResource(path="users", collectionResourceRel="users")
public interface UserRepository extends CrudRepository<User, Long>{

}
