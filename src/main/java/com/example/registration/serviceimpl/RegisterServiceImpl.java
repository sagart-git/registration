package com.example.registration.serviceimpl;

import com.example.registration.dto.UserDTO;
import com.example.registration.entity.UserEntity;
import com.example.registration.repository.UserRegistrationRepository;
import com.example.registration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegistrationService {

    @Autowired
    UserRegistrationRepository userRegistrationRepository;
    @Override
    public void register(UserDTO user) {
   UserEntity userEntity = UserEntity.builder().userName(user.getUserName()).email(user.getEmail()).dob(user.getDob()).build();
        this.userRegistrationRepository.save(userEntity);
    }
}
