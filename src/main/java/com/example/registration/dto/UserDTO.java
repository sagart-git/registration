package com.example.registration.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String userName;
    private String email;
    private LocalDate dob;

}
