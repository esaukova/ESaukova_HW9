package ru.netology.esaukova.hw9.services;

public class Radio {

    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentNumberOfRadioStation = minRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio(int numRadioStation) {
        this.maxRadioStation = numRadioStation - 1;
    }

    public Radio() {
    }

    public int getCurrentNumberOfRadioStation() {
        return currentNumberOfRadioStation;
    }

    public void setCurrentNumberOfRadioStation(int numRadioStation) {
        if (numRadioStation >= minRadioStation && numRadioStation <= maxRadioStation) {
            this.currentNumberOfRadioStation = numRadioStation;
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
            this.currentVolume = newCurrentVolume;
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
