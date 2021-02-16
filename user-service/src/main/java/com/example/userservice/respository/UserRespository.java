package com.example.userservice.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userservice.model.User;

@Repository
public interface UserRespository extends JpaRepository<User, Long>{

	User findUserById(Long id);

}
