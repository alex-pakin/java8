package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    Radio radio = new Radio();
    Radio radio1 = new Radio(50);

    @Test
    void shouldCalculateQuantity() {
        int actual = radio.getQuantityOfStation();
        int actual1 = radio1.getQuantityOfStation();
        Assertions.assertEquals(10,actual);
        Assertions.assertEquals(50,actual1);
    }


    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"})
    void shouldSetCurrentStation( int currentStation, int expectedDefaultQuantity,int expectedNotDefaultQuantity) {
        radio.setCurrentStation(currentStation);
        radio1.setCurrentStation(currentStation);
        Assertions.assertEquals(expectedDefaultQuantity,radio.getCurrentStation());
        Assertions.assertEquals(expectedNotDefaultQuantity,radio1.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data2.csv"})
    void shouldIncreaseStation(int currentStation, int expectedDefaultQuantity,int expectedNotDefaultQuantity) {
        radio.setCurrentStation(currentStation);
        radio.increaseStation();
        radio1.setCurrentStation(currentStation);
        radio1.increaseStation();
        Assertions.assertEquals(expectedDefaultQuantity,radio.getCurrentStation());
        Assertions.assertEquals(expectedNotDefaultQuantity,radio1.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data3.csv"})
    void shouldDecreaseStation(int currentStation, int expectedDefaultQuantity,int expectedNotDefaultQuantity) {
        radio.setCurrentStation(currentStation);
        radio.decreaseStation();
        radio1.setCurrentStation(currentStation);
        radio1.decreaseStation();
        Assertions.assertEquals(expectedDefaultQuantity,radio.getCurrentStation());
        Assertions.assertEquals(expectedNotDefaultQuantity,radio1.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data4.csv"})
    void shouldSetCurrentVolume( int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        Assertions.assertEquals(expected,radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data5.csv"})
    void shouldIncreaseVolume(int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();
        Assertions.assertEquals(expected,radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data6.csv"})
    void shouldDecreaseVolume(int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();
        Assertions.assertEquals(expected,radio.getCurrentVolume());
    }
}
