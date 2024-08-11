package com.consumption.consumption.service;

import com.consumption.consumption.entity.City;
import com.consumption.consumption.model.Request;
import com.consumption.consumption.repostory.CityRepository;
import com.consumption.consumption.repostory.ConsumptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Tüketim hesaplama işlemlerini yapan servis sınıfı.
 */
@RequiredArgsConstructor
@Service
public class ConsumptionService {

    // Farklı sıcaklık aralıkları için fiyatlar
    private final int price = 10;
    private final int priceTwo = 15;
    private final int priceThree = 20;
    private final int priceFour = 25;

    private final CityRepository cityRepository;

    /**
     * Kullanıcının girdiği sıcaklık ve plaka bilgisine göre toplam tüketimi hesaplar.
     */
    public double calculate(Request request) {
        double total = 0;
        if (request != null) {
            int temprature = request.getTemprature();
            String plaka = request.getPlaka();
            City city = cityRepository.findByPlaka(plaka);

            // Sıcaklık aralığına göre tüketimi hesapla
            if (temprature < 0) {
                total = priceFour * city.getUnitePrice();
            } else if (temprature > 0 && temprature < 15) {
                total = priceThree * city.getUnitePrice();
            } else if (temprature > 15 && temprature < 25) {
                total = priceTwo * city.getUnitePrice();
            } else {
                total = price * city.getUnitePrice();
            }
        }
        return total;
    }
}
