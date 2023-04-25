package com.example.Ecommerce.website.Modal;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
    @Column(name = "address_line1")
private String addressLine1;
    @Column(name = "address_line2")
private String addressLine2;
    @Column(name = "city")
private String city;
    @Column(name = "postal")
private String postal;
    @Column(name = "country")
private String country;
    @Column(name = "mobile")
private String mobile;

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "user_id")
private  Users userId;
}
