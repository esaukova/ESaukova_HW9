package ru.netology.esaukova.hw9.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    void setStation() {
        radio.setCurrentNumberOfRadioStation(5); //число в рабочем диапозоне от 0 до 9
        Assertions.assertEquals(5, radio.getCurrentNumberOfRadioStation());
    }

    @Test
    void setCustomStation() {
        Radio radio = new Radio(20);
        radio.setCurrentNumberOfRadioStation(15); //число в рабочем диапозоне от 0 до 19
        Assertions.assertEquals(15, radio.getCurrentNumberOfRadioStation());
    }

    @Test
    void setStationUnderMin() {
        radio.setCurrentNumberOfRadioStation(-1); //число меньше 0
        Assertions.assertEquals(0, radio.getCurrentNumberOfRadioStation());
    }

    @Test
    void setStationAboveMax() {
        radio.setCurrentNumberOfRadioStation(10); //число выше 9
        Assertions.assertEquals(0, radio.getCurrentNumberOfRadioStation());
    }

    @Test
    void setCustomStationAboveMax() {
        Radio radio = new Radio(20);
        radio.setCurrentNumberOfRadioStation(25); //число выше 19
        Assertions.assertEquals(0, radio.getCurrentNumberOfRadioStation());
    }

    @Test
    void nextStation() {
        radio.setCurrentNumberOfRadioStation(5); //число в рабочем диапозоне от 0 до 8
        radio.nextRadioStation();
        Assertions.assertEquals(6, radio.getCurrentNumberOfRadioStation());
    }

    @Test
    void nextCustomStation() {
        Radio radio = new Radio(20);
        radio.setCurrentNumberOfRadioStation(15); //число в рабочем диапозоне от 0 до 18
        radio.nextRadioStation();
        Assertions.assertEquals(16, radio.getCurrentNumberOfRadioStation());
    }

    @Test
    void nextAboveMaxStation() {
        radio.setCurrentNumberOfRadioStation(9); //число 9
        radio.nextRadioStation();
        Assertions.assertEquals(0, radio.getCurrentNumberOfRadioStation());
    }

    @Test
    void nextCustomAboveMaxStation() {
        Radio radio = new Radio(20);
        radio.setCurrentNumberOfRadioStation(19); //число 19
        radio.nextRadioStation();
        Assertions.assertEquals(0, radio.getCurrentNumberOfRadioStation());
    }

    @Test
    void prevStation() {
        radio.setCurrentNumberOfRadioStation(5); //число в рабочем диапозоне от 1 до 9
        radio.prevRadioStation();
        Assertions.assertEquals(4, radio.getCurrentNumberOfRadioStation());
    }

    @Test
    void prevCustomStation() {
        Radio radio = new Radio(20);
        radio.setCurrentNumberOfRadioStation(15); //число в рабочем диапозоне от 1 до 19
        radio.prevRadioStation();
        Assertions.assertEquals(14, radio.getCurrentNumberOfRadioStation());
    }

    @Test
    void prevBelowMinStation() {
        radio.setCurrentNumberOfRadioStation(0); //число 0
        radio.prevRadioStation();
        Assertions.assertEquals(9, radio.getCurrentNumberOfRadioStation());
    }

    @Test
    void prevCustomBelowMinStation() {
        Radio radio = new Radio(20);
        radio.setCurrentNumberOfRadioStation(0); //число 0
        radio.prevRadioStation();
        Assertions.assertEquals(19, radio.getCurrentNumberOfRadioStation());
    }

    @Test
    void setVolume() {
        radio.setCurrentVolume(10); //число в рабочем диапозоне от 0 до 100
        Assertions.assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void setVolumeAboveMax() {
        radio.setCurrentVolume(101); //число больше 100
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setVolumeBelowMin() {
        radio.setCurrentVolume(-1); //число меньше 0
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void increaseVolume() {
        radio.setCurrentVolume(10); //число в рабочем диапозоне от 0 до 99
        radio.increaseVolume();
        Assertions.assertEquals(11, radio.getCurrentVolume());
    }

    @Test
    void increaseAboveMaxVolume() {
        radio.setCurrentVolume(100); //число 100
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolume() {
        radio.setCurrentVolume(10); //число в рабочем диапозоне от 1 до 100
        radio.decreaseVolume();
        Assertions.assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    void decreaseBelowMinVolume() {
        radio.setCurrentVolume(0); ///число 0
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

}
