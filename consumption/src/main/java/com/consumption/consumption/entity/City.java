package com.consumption.consumption.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Bu sınıf, şehir bilgilerini temsil eder ve veritabanı ile ilişkili bir varlıktır.
 */
@Entity
@Data
public class City {

    // Şehir için otomatik oluşturulan benzersiz kimlik
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Şehir adı
    private String name;

    // Şehir plaka kodu
    private String plaka;

    // Şehir için belirlenen birim fiyat
    private double unitePrice;

    // Parametreli constructor, şehir bilgilerini başlatmak için kullanılır
    public City(String name, String plaka, double unitePrice ) {
        this.name = name;
        this.plaka = plaka;
        this.unitePrice = unitePrice;
    }

    // Parametresiz constructor, Hibernate gibi araçlar tarafından kullanılır
    public City() {

    }
}
