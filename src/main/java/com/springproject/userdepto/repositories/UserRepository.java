package com.springproject.userdepto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.userdepto.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
