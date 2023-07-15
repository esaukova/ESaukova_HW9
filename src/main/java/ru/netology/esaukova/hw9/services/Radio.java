package ru.netology.esaukova.hw9.services;

public class Radio {
    private int currentNumberOfRadioStation;
    private int currentVolume;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;

    public int getCurrentNumberOfRadioStation() {
        return currentNumberOfRadioStation;
    }

    public void setCurrentNumberOfRadioStation(int newNumberOfRadioStation) {
        if (newNumberOfRadioStation >= minRadioStation && newNumberOfRadioStation <= maxRadioStation) {
            currentNumberOfRadioStation = newNumberOfRadioStation;
        }
    }

    public void nextRadioStation() {
        if (currentNumberOfRadioStation >= maxRadioStation) {
            setCurrentNumberOfRadioStation(minRadioStation);
        } else {
            currentNumberOfRadioStation++;
        }
    }

    public void prevRadioStation() {
        if (currentNumberOfRadioStation <= minRadioStation) {
            setCurrentNumberOfRadioStation(maxRadioStation);
        } else {
            currentNumberOfRadioStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= minVolume && newCurrentVolume <= maxVolume) {
            currentVolume = newCurrentVolume;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}
