package com.example.Ecommerce.website.Service;


import com.example.Ecommerce.website.DTO.UserDto;
import com.example.Ecommerce.website.Modal.Users;
import com.example.Ecommerce.website.Repository.UserRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserRepo userRepo;

    public List<UserDto> getAllUsers() {
        List<Users> users = userRepo.findAll();
        List<UserDto> dtoList = new ArrayList<>();
        for (Users user : users){
            UserDto userDto = new UserDto();
            userDto.setFName(user.getFName());
            userDto.setLName(user.getLName());
            userDto.setCreatedAt(user.getCreatedAt());
            userDto.setModifiedAt(user.getModifiedAt());
            userDto.setMobile(user.getMobile());
            dtoList.add(userDto);
        }
        return dtoList;
    }


    public UserDto getUserById(int id) {
        Users users1=userRepo.findById(id).get();
        UserDto userDto=new UserDto();
        userDto.setMobile(users1.getMobile());
        userDto.setCreatedAt(users1.getCreatedAt());
        userDto.setFName(users1.getFName());
        userDto.setLName(users1.getLName());
        userDto.setModifiedAt(users1.getModifiedAt());
        return userDto;

    }

    public UserDto getUserByName(String name) {
        Users users=userRepo.findUserByName(name);
        UserDto userDto=new UserDto();
        userDto.setModifiedAt(users.getModifiedAt());
        userDto.setMobile(users.getMobile());
        userDto.setFName(users.getFName());
        userDto.setLName(users.getLName());
        userDto.setCreatedAt(users.getCreatedAt());
        return userDto;
    }

    public UserDto addUser(UserDto userDto) {

        Users user = new Users(userDto);
        Users users1 = userRepo.save(user);
        UserDto userDto1=new UserDto(users1);
        return userDto1;
    }

    public void deleteUser(int id) {
       // Users users=userRepo.findById(id);
        userRepo.deleteById(id);

    }
}
