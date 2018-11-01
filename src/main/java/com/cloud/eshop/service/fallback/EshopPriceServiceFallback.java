package com.cloud.eshop.service.fallback;

import org.springframework.stereotype.Component;

import com.cloud.eshop.service.EshopPriceService;

@Component
public class EshopPriceServiceFallback implements EshopPriceService {

	@Override
	public String findByProductId(Long productId) {
		return "降级价格数据";
	}

}
