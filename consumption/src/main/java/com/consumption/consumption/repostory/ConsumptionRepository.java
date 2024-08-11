package com.consumption.consumption.repostory;

import com.consumption.consumption.entity.Consumption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Bu interface, Consumption tablosuna erişim sağlamak için kullanılır.
 */
@Repository
public interface ConsumptionRepository extends JpaRepository<Consumption, Long> {
    // Burada özel sorgular eklenebilir
}
