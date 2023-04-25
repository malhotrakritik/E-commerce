package com.example.Ecommerce.website.Modal;

import com.example.Ecommerce.website.DTO.OrderDetailsDto;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "total")
    private float total;
    @Column(name = "created_at")
    private Long createdAt;
    @Column(name = "modified_at")
    private Long modifiedAt;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_Id")
    private Users userId;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "payment_id")
    private PaymentDetails paymentId;


    public OrderDetails(OrderDetailsDto orderDetailsDto) {
        this.createdAt = orderDetailsDto.getCreatedAt();
        this.total = orderDetailsDto.getTotal();
        this.modifiedAt = orderDetailsDto.getCreatedAt();
    }

}
