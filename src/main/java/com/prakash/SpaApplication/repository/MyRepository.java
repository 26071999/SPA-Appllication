package com.prakash.SpaApplication.repository;

import com.prakash.SpaApplication.model.User;
import org.springframework.data.repository.CrudRepository;

public interface MyRepository extends CrudRepository<User,String> {

}
