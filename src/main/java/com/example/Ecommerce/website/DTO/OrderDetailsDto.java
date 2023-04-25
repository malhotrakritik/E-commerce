package com.example.Ecommerce.website.DTO;

import com.example.Ecommerce.website.Modal.OrderDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDetailsDto {
    private Integer id;
    private float total;
    private Long createdAt;
    private Long modifiedAt;

    public OrderDetailsDto(OrderDetails orderDetails) {
        this.createdAt= orderDetails.getCreatedAt();
        this.total= orderDetails.getTotal();
        this.modifiedAt= orderDetails.getCreatedAt();
    }
}
