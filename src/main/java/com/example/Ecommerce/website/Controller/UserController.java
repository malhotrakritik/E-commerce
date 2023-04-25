package com.example.Ecommerce.website.Controller;

import com.example.Ecommerce.website.DTO.UserDto;
import com.example.Ecommerce.website.Modal.Users;
import com.example.Ecommerce.website.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getAllUsers")
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable(name = "id") int id){
        return userService.getUserById(id);
    }

    @GetMapping("/byname")
    public UserDto getUserByName(@RequestParam("name") String name){
        return userService.getUserByName(name);
    }

    @PostMapping("/adduser")
    public UserDto addUser(@RequestBody UserDto userDto){
        return userService.addUser(userDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable int id){
        try {
            userService.deleteUser(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception exception){
            log.info("Error in {}",exception.getMessage());
            exception.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
