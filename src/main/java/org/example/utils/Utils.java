package org.example.utils;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Scanner;

public class Utils {
    public static int getDigit(int min,int max, String input, String error){
        int result = -1;
        while (result == -1) {
            System.out.println(input);
            Scanner scanner = new Scanner(System.in);
            String st = scanner.nextLine();
            boolean isDigit = true;
            if (st.length() > 0) {
                for (int i = 0; i < st.length(); i++) {
                    if (!Character.isDigit(st.charAt(i))) {
                        isDigit = false;
                    }
                }
                if (isDigit) {
                    if (Integer.parseInt(st) >= min && Integer.parseInt(st) <= max) {
                        result = Integer.parseInt(st);
                    }
                }

            }
            if (result == -1) {
                System.err.println(error);
            }
        }
        return result;
    }
    public static String getString(int size,String input, String error){
        String result = "";
        while(size > result.length()){
            System.out.println(input);
            Scanner scanner = new Scanner(System.in);
            result = scanner.nextLine();
            if (size > result.length()) {
                System.err.println(error);
            }
        }
        return result;
    }
    public static LocalDate getLocalDate(){
        int year = getDigit(1900, LocalDate.now().getYear(),"enter year","wrong year");
        int months = getDigit( 1, 12,"enter months","wrong months");
        int day = getDigit( 1, 31,"enter day","wrong day");
        String monthsS;
        String dayS;
        if (months < 10){
            monthsS = "0" + months;
        } else {monthsS = String.valueOf(months);}
        if (months < 10){
            dayS = "0" + day;
        } else {dayS = String.valueOf(months);}
        String date = year + "-" + monthsS + "-" + dayS;
        LocalDate localDate = LocalDate.parse(date);
        return localDate;
    }
    public static void waitEnter(){
        System.out.println("please press enter");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
