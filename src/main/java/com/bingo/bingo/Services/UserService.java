package com.bingo.bingo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingo.bingo.Models.UserModel;
import com.bingo.bingo.Repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    public UserModel insertUser(UserModel user) {
        return userRepository.save(user);
    }

    public UserModel updateUser(UserModel user) {
        return userRepository.save(user);
    }

    public Optional<UserModel> deleteUser(int idUser) {
        Optional<UserModel> user = userRepository.findById(idUser);
        try {
            userRepository.deleteById(idUser);
        } catch (Exception e) {
            return null;
        }
        return user;
    }
}
