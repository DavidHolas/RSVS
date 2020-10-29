package com.example.rsvs.service;

import com.example.rsvs.model.User;
import com.example.rsvs.model.UserResource;
import com.example.rsvs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserResource> getAllUsers() {
        List<UserResource> items = userRepository.findAll().stream().map(this::mapEntityToDto).collect(Collectors.toList());
        return items;
    }

    public UserResource getUser(int userId) {
        User user = userRepository.getOne(userId);
        UserResource userResource = mapEntityToDto(user);
        return userResource;
    }

    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }

    public void addUser(UserResource userResource) {

    }

    public UserResource mapEntityToDto(User user) {
        UserResource userResource = new UserResource();
        userResource.setUserName(user.getUserName());
        userResource.setEmail(user.getEmail());
        userResource.setPassword(user.getPassword());
        return userResource;
    }
}
