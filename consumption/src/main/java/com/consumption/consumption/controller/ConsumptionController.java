package com.consumption.consumption.controller;

import com.consumption.consumption.entity.Consumption;
import com.consumption.consumption.model.Request;
import com.consumption.consumption.repostory.ConsumptionRepository;
import com.consumption.consumption.service.ConsumptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Bu sınıf, tüketimle ilgili HTTP isteklerini işlemek için kullanılır.
 */
@RequiredArgsConstructor
@RestController
public class ConsumptionController {

    private final ConsumptionRepository consumptionRepository;
    private final ConsumptionService consumptionService;

    // Tüketim verisini hesaplayan ve kaydeden API endpoint'i
    @PostMapping("/api/consumption")
    public double saveConsumption(@RequestBody Request request) {
        return consumptionService.calculate(request);
    }
}
