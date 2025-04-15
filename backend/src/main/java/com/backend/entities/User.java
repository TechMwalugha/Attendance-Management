package com.backend.entities;

import com.backend.dto.UserDTO;
import com.backend.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="app_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private String name;

    private UserRole userRole;

    public UserDTO getDto() {
        UserDTO dto = new UserDTO();

        dto.setId(id);
        dto.setEmail(email);
        dto.setUserRole(userRole);
        dto.setName(name);

        return dto;
    }

}
