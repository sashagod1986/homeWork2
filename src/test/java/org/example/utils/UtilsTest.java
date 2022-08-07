package org.example.utils;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {


    @Test @Disabled
    public void getLocalDate() {
        LocalDate date = LocalDate.parse("2016-08-16");
        assertEquals(String.valueOf(date), "2016-08-16");
    }

}