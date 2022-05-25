package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void shouldSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldIncreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.increaseStation();
        int actual = radio.getCurrentStation();
        int expected = 3;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldDecreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.decreaseStation();
        int actual = radio.getCurrentStation();
        int expected = 4;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        int actual = radio.getCurrentVolume();
        int expected = 8;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected,actual);
    }


}
