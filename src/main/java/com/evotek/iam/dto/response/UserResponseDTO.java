package com.evotek.iam.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {
    int id;
    String fullName;
    LocalDate birthDate;
    String phone;
    String address;
    String email;
    String avatar;
    int roleId;
}
