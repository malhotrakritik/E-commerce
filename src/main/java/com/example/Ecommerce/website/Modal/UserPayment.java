package com.example.Ecommerce.website.Modal;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "payment_type")
    private String paymentType;
    @Column(name = "provider")
    private String provider;
    @Column(name = "account_no")
    private int accountNo;
    @Column(name = "expiry")
    private Long expiry;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private Users userId;
}
