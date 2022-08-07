package org.example.store;

import org.example.utils.Utils;

import java.io.*;

public class StoreEngine {
    public static void storeEngine(){
        Store store = new Store("store");
        // read store object from file
        try {
            FileInputStream fis = new FileInputStream("store.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            store = (Store) ois.readObject();
            System.out.println("store object loaded from file");
            ois.close();
        } catch (IOException | ClassNotFoundException e) {throw new RuntimeException(e);}

        int menu = 1;
        while(menu != 0) {
            System.out.println("""
                    1. add or read or edit manufacturer
                    2. add or read or edit souvenir
                    3. list souvenir from manufacturer
                    4. list souvenir from country
                    5. list manufacturers of souvenirs that are cheaper than
                    6. list all manufacturer and their souvenirs
                    7. list manufacturers of the given souvenir produced in the given
                    8. list of souvenirs produced at year
                    9. delete manufacturer and his souvenirs
                    0. exit
                    """);
            menu = Utils.getDigit(0,8,"enter menu item","wrong menu item");
            if (menu == 1){
                int menu1 = 1;
                while(menu1 != 0){
                    System.out.println("""
                    1. add manufacturer
                    2. read manufacturer
                    3. edit manufacturer
                    0. exit
                    """);
                    menu1 = Utils.getDigit(0,3,"enter menu item","wrong menu item");
                    if (menu1 == 1) {
                        store.addManufacturer();
                    }
                    if (menu1 == 2) {
                        if (store.getManufacturerSize() > 0) {
                            store.listManufacturers();
                        } else {
                            System.out.println("no manufacturer");
                        }
                    }
                    if (menu1 == 3) {
                        if (store.getManufacturerSize() > 0) {
                            store.changeManufacturer(Utils.getDigit(1,store.getManufacturerSize(),"enter manufacturer index","wrong manufacturer index")-1);
                        } else {
                            System.out.println("no manufacturer");
                        }
                    }
                    Utils.waitEnter();
                }
            }
            if (menu == 2) {

            }
            if (menu == 3) {

            }
            if (menu == 4) {

            }
            if (menu == 5) {

            }
            if (menu == 6) {

            }
            if (menu == 7) {

            }
            if (menu == 8) {

            }
            if (menu == 9) {
                if (store.getManufacturerSize() > 0) {
                    store.removeManufacturer(Utils.getDigit(1,store.getManufacturerSize(),"enter manufacturer index","wrong manufacturer index")-1);
                } else {
                    System.out.println("no manufacturer");
                }
            }
        }
        // save store object to file
        try (FileOutputStream fos = new FileOutputStream("store.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(store);
            System.out.println("store object saved to file");
        } catch (IOException e) {throw new RuntimeException(e);}
    }
}
