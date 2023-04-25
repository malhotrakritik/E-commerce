package com.example.Ecommerce.website.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserAddressDto {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String postal;
    private String country;
    private String mobile;

}
