package ru.netology.esaukova.hw9.services;

public class Radio {

    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentNumberOfRadioStation = minRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;
    private int numRadioStation = 10;

    public Radio(int newNumRadioStation) {
        this.maxRadioStation = newNumRadioStation - 1;
    }

    public Radio() {
    }

    public int getCurrentNumberOfRadioStation() {
        return currentNumberOfRadioStation;
    }

    public void setCurrentNumberOfRadioStation(int newNumberOfRadioStation) {
        if (newNumberOfRadioStation >= minRadioStation && newNumberOfRadioStation <= maxRadioStation) {
            this.currentNumberOfRadioStation = newNumberOfRadioStation;
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
