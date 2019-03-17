package com.techsams.spring.price;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Price {
    private Double originalPrice;
    private Double currentPrice;
    private Double promotionPrice;

    public Price(Double originalPrice, Double currentPrice, Double promotionPrice) {
        this.originalPrice = originalPrice;
        this.currentPrice = currentPrice;
        this.promotionPrice = promotionPrice;
    }
}
