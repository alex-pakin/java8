package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"})
    void shouldSetCurrentStation( int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data2.csv"})
    void shouldIncreaseStation(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        radio.increaseStation();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data3.csv"})
    void shouldDecreaseStation(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        radio.decreaseStation();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data4.csv"})
    void shouldSetCurrentVolume( int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data5.csv"})
    void shouldIncreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data6.csv"})
    void shouldDecreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
}
