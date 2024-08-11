package com.consumption.consumption.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Bu sınıf, tüketim bilgilerini temsil eder ve veritabanı ile ilişkili bir varlıktır.
 */
@Entity
@Data
public class Consumption {

    // Tüketim için otomatik oluşturulan benzersiz kimlik
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Şehir adı
    private String cityName;

    // Sıcaklık aralığı
    private String temperatureRange;

    // Ortalama tüketim miktarı
    private Double averageConsumption;
}
