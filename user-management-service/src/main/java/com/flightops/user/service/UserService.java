package com.flightops.user.service;

import com.flightops.user.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO getUserById(int id);
    List<UserDTO> getAllUsers();
    UserDTO updateUser(int id, UserDTO userDTO);
    void deleteUser(int id);

}
