package com.consumption.consumption.config;

import com.consumption.consumption.entity.City;
import com.consumption.consumption.repostory.CityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Veritabanına başlangıçta bazı şehir verilerini yükleyen sınıf.
 */
@Configuration
public class DataLoader {

    @Bean
    public CommandLineRunner loadData(CityRepository cityRepository) {
        return args -> {
            // Şehir verilerini veritabanına kaydetme işlemi
            // Büyükşehirlerin birim fiyatlarını biraz daha yüksek belirledim.
            cityRepository.save(new City("Adana", "01", 2));
            cityRepository.save(new City("Adıyaman", "02", 1.5));
            cityRepository.save(new City("Afyonkarahisar", "03", 1.8));
            cityRepository.save(new City("Ağrı", "04", 1.4));
            cityRepository.save(new City("Amasya", "05", 1.6));
            cityRepository.save(new City("Ankara", "06", 3));
            cityRepository.save(new City("Antalya", "07", 2.2));
            cityRepository.save(new City("Artvin", "08", 1.3));
            cityRepository.save(new City("Aydın", "09", 2));
            cityRepository.save(new City("Balıkesir", "10", 2));
            cityRepository.save(new City("Bilecik", "11", 1.5));
            cityRepository.save(new City("Bingöl", "12", 1.3));
            cityRepository.save(new City("Bitlis", "13", 1.4));
            cityRepository.save(new City("Bolu", "14", 1.6));
            cityRepository.save(new City("Burdur", "15", 1.7));
            cityRepository.save(new City("Bursa", "16", 2.5));
            cityRepository.save(new City("Çanakkale", "17", 1.8));
            cityRepository.save(new City("Çankırı", "18", 1.5));
            cityRepository.save(new City("Çorum", "19", 1.6));
            cityRepository.save(new City("Denizli", "20", 2));
            cityRepository.save(new City("Diyarbakır", "21", 2));
            cityRepository.save(new City("Edirne", "22", 1.8));
            cityRepository.save(new City("Elazığ", "23", 1.8));
            cityRepository.save(new City("Erzincan", "24", 1.5));
            cityRepository.save(new City("Erzurum", "25", 1.4));
            cityRepository.save(new City("Eskişehir", "26", 2.3));
            cityRepository.save(new City("Gaziantep", "27", 2.2));
            cityRepository.save(new City("Giresun", "28", 1.6));
            cityRepository.save(new City("Gümüşhane", "29", 1.4));
            cityRepository.save(new City("Hakkari", "30", 1.3));
            cityRepository.save(new City("Hatay", "31", 2));
            cityRepository.save(new City("Isparta", "32", 1.7));
            cityRepository.save(new City("Mersin", "33", 2.2));
            cityRepository.save(new City("İstanbul", "34", 3));
            cityRepository.save(new City("İzmir", "35", 3));
            cityRepository.save(new City("Kars", "36", 1.4));
            cityRepository.save(new City("Kastamonu", "37", 1.6));
            cityRepository.save(new City("Kayseri", "38", 2.2));
            cityRepository.save(new City("Kırklareli", "39", 1.7));
            cityRepository.save(new City("Kırşehir", "40", 1.5));
            cityRepository.save(new City("Kocaeli", "41", 2.5));
            cityRepository.save(new City("Konya", "42", 2.3));
            cityRepository.save(new City("Kütahya", "43", 1.7));
            cityRepository.save(new City("Malatya", "44", 1.8));
            cityRepository.save(new City("Manisa", "45", 2.2));
            cityRepository.save(new City("Kahramanmaraş", "46", 2));
            cityRepository.save(new City("Mardin", "47", 1.5));
            cityRepository.save(new City("Muğla", "48", 2.3));
            cityRepository.save(new City("Muş", "49", 1.4));
            cityRepository.save(new City("Nevşehir", "50", 1.5));
            cityRepository.save(new City("Niğde", "51", 1.6));
            cityRepository.save(new City("Ordu", "52", 1.7));
            cityRepository.save(new City("Rize", "53", 1.6));
            cityRepository.save(new City("Sakarya", "54", 2));
            cityRepository.save(new City("Samsun", "55", 2));
            cityRepository.save(new City("Siirt", "56", 1.3));
            cityRepository.save(new City("Sinop", "57", 1.5));
            cityRepository.save(new City("Sivas", "58", 1.7));
            cityRepository.save(new City("Tekirdağ", "59", 2));
            cityRepository.save(new City("Tokat", "60", 1.6));
            cityRepository.save(new City("Trabzon", "61", 2));
            cityRepository.save(new City("Tunceli", "62", 1.3));
            cityRepository.save(new City("Şanlıurfa", "63", 2));
            cityRepository.save(new City("Uşak", "64", 1.5));
            cityRepository.save(new City("Van", "65", 1.4));
            cityRepository.save(new City("Yozgat", "66", 1.5));
            cityRepository.save(new City("Zonguldak", "67", 1.7));
            cityRepository.save(new City("Aksaray", "68", 1.6));
            cityRepository.save(new City("Bayburt", "69", 1.3));
            cityRepository.save(new City("Karaman", "70", 1.5));
            cityRepository.save(new City("Kırıkkale", "71", 1.5));
            cityRepository.save(new City("Batman", "72", 1.5));
            cityRepository.save(new City("Şırnak", "73", 1.3));
            cityRepository.save(new City("Bartın", "74", 1.5));
            cityRepository.save(new City("Ardahan", "75", 1.3));
            cityRepository.save(new City("Iğdır", "76", 1.4));
            cityRepository.save(new City("Yalova", "77", 2));
            cityRepository.save(new City("Karabük", "78", 1.6));
            cityRepository.save(new City("Kilis", "79", 1.5));
            cityRepository.save(new City("Osmaniye", "80", 1.6));
            cityRepository.save(new City("Düzce", "81", 1.7));
        };
    }
}
