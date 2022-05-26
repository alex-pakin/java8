package ru.netology.domain;

public class Radio {

    public int currentStation;

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void increaseStation() {
        int nextStation = currentStation + 1;
        if (nextStation > 9) {
            currentStation = 0;
        } else {
            setCurrentStation(nextStation);
        }
    }

    public void decreaseStation() {
        int prevStation = currentStation - 1;
        if (prevStation < 0) {
            currentStation = 9;
        } else {
            setCurrentStation(prevStation);
        }
    }

    private int currentVolume;

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        int moreVolume = currentVolume + 1;
        if (moreVolume > 10) {
            currentVolume = 10;
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
