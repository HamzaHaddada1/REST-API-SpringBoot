package com.testcrud.demo.Services;

import com.testcrud.demo.Dao.UserRepository;
import com.testcrud.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User u){
       return userRepository.save(u);
    }
    public List<User> FindUser(String u)
    {
        return userRepository.findUserByName(u);
    }
    public int counts(String letter){
        return userRepository.countByNameEndingWith(letter);

    }
    public List<User> findkhalil(){
        return userRepository.findkhalil();
    }
    public User updateUser(Long id, User u){
        return userRepository.findById(id).map(user ->
        {
            u.setId(id);
            return userRepository.save(u);
        }
        ).orElse(
               u
        );

    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);

    }


}
