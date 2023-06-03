package com.example.rest.service;

import com.example.rest.entity.User;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface UserService {
    
    public Iterable<User> findAll();
    
    public Page<User> findAll(Pageable pageable);
    
    public Optional<User> findById(Long id);
    
    public User save(User user);
    
    public void deleteById(Long id);
    
}
