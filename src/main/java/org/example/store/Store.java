package org.example.store;

import org.example.manufacturer.Manufacturer;
import org.example.souvenir.Souvenir;
import org.example.utils.Utils;
import org.w3c.dom.ls.LSOutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Store implements Serializable {
    private static final long serialVersionUID = 8355739085133824134L;
    private String name;
    private List<Manufacturer> manufacturers;
    private List<Souvenir> souvenirs;

    public Store(String name) {
        this.name = name;
        manufacturers = new ArrayList<>();
        souvenirs = new ArrayList<>();
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
    public Manufacturer getManufacturer(int index){
        return manufacturers.get(index);
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public int getManufacturerSize(){
        return manufacturers.size();
    }
    public void removeManufacturer(Manufacturer obj){
        manufacturers.remove(obj);
    }
    public void changeManufacturer(int index){
        manufacturers.get(index).setName(Utils.getString(1,"enter name", "name empty"));
        manufacturers.get(index).setCountry(Utils.getString(1,"enter country", "country empty"));
    }

    public void addSouvenir(){
        souvenirs.add(new Souvenir(getManufacturer(Utils.getDigit(1,getManufacturerSize(),"enter manufacturer index","wrong manufacturer index")-1),
                Utils.getString(1,"enter name", "name empty"),
                Utils.getString(1,"enter manufacturer address", "manufacturer address empty"),
                Utils.getString(1,"enter manufacturer phone", "manufacturer phone empty"),
                Utils.getLocalDate(),
                Utils.getDigit(1,100000,"enter souvenir price", "wrong souvenir price")));
    }
    public List<Souvenir> getSouvenirs() {
        return souvenirs;
    }
    public int getSouvenirSize() {
        return souvenirs.size();
    }
    public void listSouvenirs() {
        for(Souvenir obj: souvenirs){
            System.out.print(souvenirs.indexOf(obj)+1 + " ");
            System.out.println(obj);
        }
//        souvenirs.forEach(System.out::println);
    }
    public void changeSouvenir(int index) {
        souvenirs.get(index).setManufacturer(getManufacturer(Utils.getDigit(1,getManufacturerSize(),"enter manufacturer index","wrong manufacturer index")-1));
        souvenirs.get(index).setName(Utils.getString(1,"enter name", "name empty"));
        souvenirs.get(index).setManufacturerAddress(Utils.getString(1,"enter manufacturer address", "manufacturer address empty"));
        souvenirs.get(index).setManufacturerPhone(Utils.getString(1,"enter manufacturer phone", "manufacturer phone empty"));
        souvenirs.get(index).setReleaseDate(Utils.getLocalDate());
        souvenirs.get(index).setPrice(Utils.getDigit(1,100000,"enter souvenir price", "wrong souvenir price"));
    }

}
