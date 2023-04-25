package com.example.Ecommerce.website.Modal;

import com.example.Ecommerce.website.DTO.OrderItemsDto;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quantiy;
    @Column(name = "created_at")
    private Long createdAt;
    @Column(name = "modified_at")
    private Long modifiedAt;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    private OrderDetails orderId;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private Products productId;


    public  OrderItems(OrderItemsDto orderItemsDto){
        this.createdAt= orderItemsDto.getCreatedAt();
        this.modifiedAt=orderItemsDto.getModifiedAt();
        this.quantiy= orderItemsDto.getQuantiy();
//        this.orderId=new OrderDetails(orderItemsDto.getOrderId());
//        this.productId=new Products(orderItemsDto.getProductId());

    }

}
