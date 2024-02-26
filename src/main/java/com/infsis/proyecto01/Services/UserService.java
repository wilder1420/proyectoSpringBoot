package com.infsis.proyecto01.Services;

import com.infsis.proyecto01.DTOs.UserDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {
    Optional<UserDTO> getUserById(Integer userID);

    UserDTO saveUser(UserDTO userDTO);
    UserDTO updateUser(Integer userId, UserDTO userDTO);

    void deleteUser(Integer userId);
}
