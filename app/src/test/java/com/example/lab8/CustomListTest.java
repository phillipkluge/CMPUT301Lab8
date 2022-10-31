package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest() {
        list = MockCityList();
        int size = list.getCount();
        list.addCity(new City("Salmon Arm", "BC"));
        assertEquals(list.getCount(), size + 1);
    }

    @Test
    public void hasCityTest() {
        list = MockCityList();
        City city = new City("Salmon Arm", "BC");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City city = new City("Salmon Arm", "BC");
        list.addCity(city);
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }
}
