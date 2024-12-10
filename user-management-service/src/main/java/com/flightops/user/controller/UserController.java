package com.flightops.user.controller;

import com.flightops.user.dto.UserDTO;
import com.flightops.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("/{id}")
    public UserDTO updateUser(@PathVariable int id, @RequestBody UserDTO userDTO) {
        return userService.updateUser(id, userDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

    @GetMapping("/search")
    public List<UserDTO> searchUsers(@RequestParam String searchTerm) {
        return userService.searchUsers(searchTerm);
    }


}
