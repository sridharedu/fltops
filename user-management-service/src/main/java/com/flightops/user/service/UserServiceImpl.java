package com.flightops.user.service;

import com.flightops.user.dto.UserDTO;
import com.flightops.user.entity.User;
import com.flightops.user.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        user = userRepository.save(user);
        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    public UserDTO getUserById(int id) {
        User user = userRepository.findById(id).orElseThrow();
        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(user -> modelMapper.map(user, UserDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO updateUser(int id, UserDTO userDTO) {
        User user = userRepository.findById(id).orElseThrow();
        modelMapper.map(userDTO, user);
        user = userRepository.save(user);
        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
