package com.example.Ecommerce.website.Repository;

import com.example.Ecommerce.website.Modal.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

    @Query(value = "select u from Users u WHERE u.userName =:name")
    public Users findUserByName(String name);
}
