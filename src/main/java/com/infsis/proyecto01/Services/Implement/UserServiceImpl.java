package com.infsis.proyecto01.Services.Implement;

import com.infsis.proyecto01.DTOs.UserDTO;
import com.infsis.proyecto01.Models.User;
import com.infsis.proyecto01.Services.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public Optional<UserDTO> getUserById(Integer userID) {
        return Optional.empty();
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO updateUser(Integer userId, UserDTO userDTO) {
        return null;
    }

    @Override
    public void deleteUser(Integer userId) {

    }

    private UserDTO UsertoDto(User user){
        UserDTO userDTO = new UserDTO(
                user.getName(),
                user.getEmail()
        );
        return userDTO;
    }

    private  User DtoToUser(UserDTO userDTO){
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());

        return user;
    }
}
