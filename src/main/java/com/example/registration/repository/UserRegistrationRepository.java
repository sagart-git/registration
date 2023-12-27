package com.example.registration.repository;

import com.example.registration.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRegistrationRepository extends CrudRepository<UserEntity,Integer> {
}
