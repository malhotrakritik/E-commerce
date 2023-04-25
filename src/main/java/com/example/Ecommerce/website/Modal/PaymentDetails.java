package com.example.Ecommerce.website.Modal;

import com.example.Ecommerce.website.DTO.PaymentDetailsDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "payment_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "order_id")
    private int orderId;
    @Column(name = "amount")
    private float amount;
    @Column(name = "provider")
    private String provider;
    @Column(name = "status")
    private String status;
    @Column(name = "created_at")
    private Long createdAt;
    @Column(name = "modified_at")
    private Long modifiedAt;


    public PaymentDetails(PaymentDetailsDto paymentDetailsDto) {
        this.amount = paymentDetailsDto.getAmount();
        this.provider= paymentDetailsDto.getProvider();
        this.createdAt= paymentDetailsDto.getCreatedAt();
        this.status= paymentDetailsDto.getStatus();
        this.orderId= paymentDetailsDto.getOrderId();
    }


}
