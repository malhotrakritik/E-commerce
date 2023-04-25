package com.example.Ecommerce.website.Service;


import com.example.Ecommerce.website.DTO.OrderItemsDto;
import com.example.Ecommerce.website.Modal.OrderItems;
import com.example.Ecommerce.website.Repository.OrderItemsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderService {


    @Autowired
    private OrderItemsRepository orderItemsRepository;
    public OrderItemsDto addOrderItems(OrderItemsDto orderItemsDto) {
        log.info("Entered addOrderItems Service");
        OrderItems orderItems=new OrderItems(orderItemsDto);
        OrderItems orderItems1=orderItemsRepository.save(orderItems);
        log.info("orderItems->{}",orderItems);
        OrderItemsDto orderItemsDto1=new OrderItemsDto(orderItems1);
        return orderItemsDto1;

    }
}
