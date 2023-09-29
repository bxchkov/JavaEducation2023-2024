package com.example.security2dbthemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.security2dbthemeleaf.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

    User findByEmail(String email);
}
