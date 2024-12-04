package com.example.isha.Service;

import com.example.isha.Model.Users;
import com.example.isha.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String signup( String name, String email, String pass){
        Users u = new Users();
        u.setEmail(email);
        u.setName(name);
        u.setPassword(pass);

        userRepository.save(u);
        return "Successfully";
    }

    public String checkEmail(String email){
      Users users = userRepository.findByEmail(email);
      if(users == null){
          return "not found";
      }
      return "found";
    }
}
