package com.example.Ecommerce.website.Controller;
import com.example.Ecommerce.website.DTO.OrderItemsDto;
import com.example.Ecommerce.website.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/orderitemsAdd")
    public OrderItemsDto addOrderItems(@RequestBody OrderItemsDto orderItemsDto){
        return orderService.addOrderItems(orderItemsDto);
    }
}
