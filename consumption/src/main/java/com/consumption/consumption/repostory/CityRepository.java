package com.consumption.consumption.repostory;

import com.consumption.consumption.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Bu interface, City tablosuna erişim sağlamak için kullanılır.
 */
@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    // Plaka koduna göre şehir aramak için metot
    City findByPlaka(String plaka);
}
