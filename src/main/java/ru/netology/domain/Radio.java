package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int quantityOfStation = 10;

    public Radio(int quantityOfStation) {
        this.quantityOfStation = quantityOfStation;
    }

    public Radio() {
    }

    public int getQuantityOfStation() {
        return quantityOfStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation >= quantityOfStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseStation() {
        int nextStation = currentStation + 1;
        if (nextStation >= quantityOfStation) {
            currentStation = 0;
        } else {
            setCurrentStation(nextStation);
        }
    }

    public void decreaseStation() {
        int prevStation = currentStation - 1;
        if (prevStation < 0) {
            currentStation = quantityOfStation - 1;
        } else {
            setCurrentStation(prevStation);
        }
    }

    public void increaseVolume() {
        int moreVolume = currentVolume + 1;
        if (moreVolume > 100) {
            currentVolume = 100;
        } else {
            setCurrentVolume(moreVolume);
        }
    }

    public void decreaseVolume() {
        int lessVolume = currentVolume - 1;
        if (lessVolume < 0) {
            currentVolume = 0;
        } else {
            setCurrentVolume(lessVolume);
        }
    }
}
