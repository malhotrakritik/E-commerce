package com.example.Ecommerce.website.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPaymentDto {
    private String paymentType;
    private String provider;
    private int accountNo;
    private Long expiry;
}
