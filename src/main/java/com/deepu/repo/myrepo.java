package com.deepu.repo;

import org.springframework.data.repository.CrudRepository;

import com.deepu.entity.Employee1;

public interface myrepo extends CrudRepository<Employee1, Integer> {

}
