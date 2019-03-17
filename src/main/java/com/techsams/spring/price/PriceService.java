package com.techsams.spring.price;

import com.techsams.spring.price.producer.PriceProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class PriceService {
    @Autowired
    private PriceProducer priceProducer;

    public void publishPrice() {
        priceProducer.publish(readPrice());
    }

    private Price readPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter original price");
        Double originalPrice = scanner.nextDouble();

        System.out.print("Enter currentPrice price");
        Double currentPrice = scanner.nextDouble();

        System.out.print("Enter promotional price");
        Double promotionalPrice = scanner.nextDouble();
        return new Price(originalPrice, currentPrice, promotionalPrice);
    }
}
