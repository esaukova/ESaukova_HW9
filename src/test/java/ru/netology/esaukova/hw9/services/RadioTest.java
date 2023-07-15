package ru.netology.esaukova.hw9.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void setStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberOfRadioStation(5); //число в рабочем диапозоне от 0 до 9
        int expected = 5;
        int actual = radio.getCurrentNumberOfRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setStationUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentNumberOfRadioStation(-1); //число меньше 0
        int expected = 0;
        int actual = radio.getCurrentNumberOfRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentNumberOfRadioStation(10); //число выше 9
        int expected = 0;
        int actual = radio.getCurrentNumberOfRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberOfRadioStation(5); //число в рабочем диапозоне от 0 до 8
        radio.nextRadioStation();
        int expected = 6;
        int actual = radio.getCurrentNumberOfRadioStation();
        Assertions. assertEquals(expected, actual);
    }

    @Test
    void nextAboveMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberOfRadioStation(9); //число 9
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentNumberOfRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberOfRadioStation(5); //число в рабочем диапозоне от 1 до 9
        radio.prevRadioStation();
        int expected = 4;
        int actual =  radio.getCurrentNumberOfRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevBelowMinStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberOfRadioStation(0); //число 0
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.getCurrentNumberOfRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10); //число в рабочем диапозоне от 0 до 99
        radio.increaseVolume();
        int expected = 11;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseAboveMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100); //число 100
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10); //число в рабочем диапозоне от 1 до 100
        radio.decreaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseBelowMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0); ///число 0
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
