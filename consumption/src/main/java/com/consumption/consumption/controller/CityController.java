package com.consumption.consumption.controller;

import com.consumption.consumption.entity.City;
import com.consumption.consumption.repostory.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Bu sınıf, şehirlerle ilgili HTTP isteklerini işlemek için kullanılır.
 */
@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:5173")  // React uygulamasının çalıştığı port
public class CityController {

    private final CityRepository cityRepository;

    // Tüm şehirleri döndüren API endpoint'i
    @GetMapping("/api/cities")
    public List<City> getCities() {
        return cityRepository.findAll();
    }
}
