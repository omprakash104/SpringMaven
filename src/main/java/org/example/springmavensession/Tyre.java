package org.example.springmavensession;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
    private String brand;

    @Override
    public String toString() {
        return "Tyre{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public Tyre() {
    }

    public Tyre(String brand) {
        this.brand = brand;
    }
}
