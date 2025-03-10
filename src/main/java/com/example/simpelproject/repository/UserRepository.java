package com.example.simpelproject.repository;

import com.example.simpelproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByIdAndDeletedAtIsNull(Integer userId);

    boolean existsByUserName(String userName);

    boolean existsByPhoneNumber(String phoneNumber);
}
