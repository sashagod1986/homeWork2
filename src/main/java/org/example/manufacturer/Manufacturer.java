package org.example.manufacturer;

import org.example.souvenir.Souvenir;
import org.example.utils.Utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Manufacturer implements Serializable {
    private String name;
    private String country;
    public Manufacturer(String name, String country) {
        this.name = name;
        this.country = country;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    @Override
    public String toString() {
        return  "name " + name + " country " + country;
    }

}
