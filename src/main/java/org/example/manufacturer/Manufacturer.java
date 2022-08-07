package org.example.manufacturer;

import org.example.souvenir.Souvenir;
import org.example.utils.Utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Manufacturer implements Serializable {
    private String name;
    private String country;
    private List<Souvenir> souvenirs;

    public Manufacturer(String name, String country) {
        this.name = name;
        this.country = country;
        souvenirs = new ArrayList<>();
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

    public void addSouvenir(){
        souvenirs.add(new Souvenir(Utils.getString(1,"enter name", "name empty"),
                Utils.getString(1,"enter manufacturer address", "manufacturer address empty"),
                Utils.getString(1,"enter manufacturer phone", "manufacturer phone empty"),
                Utils.getLocalDate(),
                Utils.getDigit(1,100000,"enter souvenir price", "wrong souvenir price")));
    }

    @Override
    public String toString() {
        return  "name " + name + " country " + country;
    }
}
