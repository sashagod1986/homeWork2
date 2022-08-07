package org.example.souvenir;

import java.io.Serializable;
import java.time.LocalDate;

public class Souvenir implements Serializable {
    private String name;
    private String manufacturerAddress;
    private String manufacturerPhone;
    private LocalDate releaseDate;
    private double price;

    public Souvenir(String name, String manufacturerAddress, String manufacturerPhone, LocalDate releaseDate, double price) {
        this.name = name;
        this.manufacturerAddress = manufacturerAddress;
        this.manufacturerPhone = manufacturerPhone;
        this.releaseDate = releaseDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturerAddress() {
        return manufacturerAddress;
    }

    public void setManufacturerAddress(String manufacturerAddress) {
        this.manufacturerAddress = manufacturerAddress;
    }

    public String getManufacturerPhone() {
        return manufacturerPhone;
    }

    public void setManufacturerPhone(String manufacturerPhone) {
        this.manufacturerPhone = manufacturerPhone;
    }
}
