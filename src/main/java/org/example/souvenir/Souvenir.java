package org.example.souvenir;

import org.example.manufacturer.Manufacturer;

import java.io.Serializable;
import java.time.LocalDate;

public class Souvenir implements Serializable {
    private String name;
    private String manufacturerAddress;
    private String manufacturerPhone;
    private LocalDate releaseDate;
    private double price;
    private Manufacturer manufacturer;
    public Souvenir(Manufacturer manufacturer,String name, String manufacturerAddress, String manufacturerPhone, LocalDate releaseDate, double price) {
        this.name = name;
        this.manufacturerAddress = manufacturerAddress;
        this.manufacturerPhone = manufacturerPhone;
        this.releaseDate = releaseDate;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Souvenir " +
                "name='" + name + '\'' +
                ", manufacturerAddress='" + manufacturerAddress + '\'' +
                ", manufacturerPhone='" + manufacturerPhone + '\'' +
                ", releaseDate=" + releaseDate +
                ", price=" + price +
                ", manufacturer=" + manufacturer;
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

    public Manufacturer getManufacturer() {
        return manufacturer;
    }
    public String getManufacturerCountry(){
        return manufacturer.getCountry();
    }
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
