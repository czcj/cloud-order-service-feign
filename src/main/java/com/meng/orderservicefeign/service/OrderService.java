package com.meng.orderservicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("product-service")
public interface OrderService {
    @RequestMapping(method = RequestMethod.GET,value = "/product/getProduct")
    String getOrder(@RequestParam("id")String productId);
}
