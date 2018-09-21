package com.test.myApp.repositories;

import com.test.myApp.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>{
        public List<User> findByName(String name);
}
