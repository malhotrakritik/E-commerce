package com.example.Ecommerce.website.DTO;
import com.example.Ecommerce.website.Modal.OrderDetails;
import com.example.Ecommerce.website.Modal.OrderItems;
import com.example.Ecommerce.website.Modal.Products;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemsDto {
    private int quantiy;
    private Long createdAt;
    private Long modifiedAt;
    private Long orderId;
    private Long productId;
    public OrderItemsDto(OrderItems orderItems){
        this.createdAt=orderItems.getCreatedAt();
        this.modifiedAt= orderItems.getModifiedAt();
        this.quantiy=orderItems.getQuantiy();
//        this.orderId=new OrderDetailsDto(orderItems.getOrderId());
//        this.productId=new ProductDto(orderItems.getProductId());
    }
}
