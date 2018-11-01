package com.cloud.eshop.service.fallback;

import org.springframework.stereotype.Component;

import com.cloud.eshop.service.EshopInventoryService;

@Component
public class EshopInventoryServiceFallback implements EshopInventoryService {
	
	@Override
	public String findByProductId(Long productId) {
		return "降级库存数据";
	}

}
