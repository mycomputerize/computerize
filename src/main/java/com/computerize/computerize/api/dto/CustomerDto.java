package com.computerize.computerize.api.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Data
@NoArgsConstructor
public class CustomerDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private LocalDate birthday;
}
