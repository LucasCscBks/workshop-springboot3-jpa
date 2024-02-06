package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
    
    @SuppressWarnings("null")
    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    @SuppressWarnings("null")
    public User insert(User obj) {
        return repository.save(obj);
    }

    @SuppressWarnings("null")
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
