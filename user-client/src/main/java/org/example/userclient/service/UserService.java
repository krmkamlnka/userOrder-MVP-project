package org.example.userclient.service;

import org.example.userclient.entity.User;
import org.example.userclient.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByName(username);
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
