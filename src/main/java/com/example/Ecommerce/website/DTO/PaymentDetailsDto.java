package com.example.Ecommerce.website.DTO;

import com.example.Ecommerce.website.Modal.PaymentDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDetailsDto {
    private int orderId;
    private float amount;
    private String provider;
    private String status;
    private Long createdAt;
    private Long modifiedAt;

    public PaymentDetailsDto(PaymentDetails paymentDetails) {
        this.amount = paymentDetails.getAmount();
        this.provider= paymentDetails.getProvider();
        this.createdAt= paymentDetails.getCreatedAt();
        this.status= paymentDetails.getStatus();
        this.orderId= paymentDetails.getOrderId();
    }
}
