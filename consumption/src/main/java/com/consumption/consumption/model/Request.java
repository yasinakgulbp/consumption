package com.consumption.consumption.model;

import lombok.Data;

/**
 * Bu sınıf, kullanıcıdan gelen sıcaklık ve plaka bilgisini tutar.
 */
@Data
public class Request {
    private int temprature;  // Kullanıcının girdiği sıcaklık değeri
    private String plaka;    // Kullanıcının seçtiği şehrin plaka kodu
}
