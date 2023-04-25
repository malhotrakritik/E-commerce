package com.example.Ecommerce.website.DTO;

import com.example.Ecommerce.website.Modal.Users;
import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserDto {
    private String fName;
    private String lName;
    private String mobile;
    private Long createdAt;
    private Long modifiedAt;
    private String userName;


    public UserDto(Users users) {
        this.fName=users.getFName();
        this.lName=users.getLName();
        this.mobile=users.getMobile();
        this.createdAt=users.getCreatedAt();
        this.modifiedAt=users.getModifiedAt();
        this.userName=users.getUserName();
    }
}
