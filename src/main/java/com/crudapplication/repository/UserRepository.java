package com.crudapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapplication.model.UserLogin;

public interface UserRepository extends JpaRepository<UserLogin, Long>{

}
