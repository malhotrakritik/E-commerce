package com.example.Ecommerce.website.Modal;

import com.example.Ecommerce.website.DTO.UserDto;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "first_name")
    private String fName;
    @Column(name = "last_name")
    private String lName;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "created_at")
    private Long createdAt;
    @Column(name = "modified_at")
    private Long modifiedAt;

    //TODO: Add address


    public Users(UserDto userDto) {
        this.fName=userDto.getFName();
        this.lName=userDto.getLName();
        this.mobile=userDto.getMobile();
        this.createdAt=userDto.getCreatedAt();
        this.modifiedAt=userDto.getModifiedAt();
        this.userName=userDto.getUserName();
    }
}
