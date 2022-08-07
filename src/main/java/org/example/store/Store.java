package org.example.store;

import org.example.manufacturer.Manufacturer;
import org.example.utils.Utils;
import org.w3c.dom.ls.LSOutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Store implements Serializable {
    private String name;
    private List<Manufacturer> manufacturers;

    public Store(String name) {
        this.name = name;
        manufacturers = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "name " + name;
    }

    public void addManufacturer(){
        manufacturers.add(new Manufacturer(Utils.getString(1,"enter name", "name empty"),
                Utils.getString(1,"enter country", "country empty")));
    }
    public void listManufacturers() {
//        manufacturers.forEach(System.out::println);
        for(Manufacturer obj: manufacturers){
            System.out.print(manufacturers.indexOf(obj)+1 + " ");
            System.out.println(obj);
        }
    }
    public int getManufacturerSize(){
        return manufacturers.size();
    }
    public void removeManufacturer(int index){
        manufacturers.remove(index);
    }
    public void changeManufacturer(int index){
        manufacturers.get(index).setName(Utils.getString(1,"enter name", "name empty"));
        manufacturers.get(index).setCountry(Utils.getString(1,"enter country", "country empty"));
    }


}
