package com.cloud.eshop.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.eshop.service.EshopInventoryService;
import com.cloud.eshop.service.EshopPriceService;

@RestController
@RequestMapping("/one")  
public class EshopOneServiceController {

    @Autowired
    private EshopInventoryService eshopInventoryService;
    @Autowired
    private EshopPriceService eshopPriceService;

    @RequestMapping("/findInventoryByProductId")
    @ResponseBody
    public String findInventoryByProductId(Long productId) {
        return eshopInventoryService.findByProductId(productId);
    }

    @RequestMapping("/findPriceByProductId")
    @ResponseBody
    public String findPriceByProductId(Long productId) {
        return eshopPriceService.findByProductId(productId);
    }
}