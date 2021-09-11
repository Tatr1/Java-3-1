package ru.netology;

public class Radio {
    private int maxVolume = 10;
    private int minVolume = 0;
    private int maxWave = 9;
    private int minWave = 0;
    private int currentVolume;
    private int currentWave;

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentWave(int currentWave) {
        if (currentWave < minWave) {
            return;
        }
        if (currentWave > maxWave) {
            return;
        }
        this.currentWave = currentWave;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public void increaseVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume == maxVolume) {
            this.currentVolume = maxVolume;
        }
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume == minVolume) {
            this.currentVolume = minVolume;
        }
        if (currentVolume > minVolume) {
            this.currentVolume = currentVolume - 1;
        }
    }

    public void increaseWave(int currentWave) {
        if (currentWave < minWave) {
            return;
        }
        if (currentWave > maxWave) {
            return;
        }
        if (currentWave < maxWave) {
            this.currentWave = currentWave + 1;
        }
        if (currentWave == maxWave) {
            this.currentWave = minWave;
        }
    }

    public void decreaseWave(int currentWave) {
        if (currentWave > maxWave) {
            return;
        }
        if (currentWave < minWave) {
            return;
        }
        if (currentWave == minWave) {
            this.currentWave = maxWave;
        }
        if (currentWave > minWave) {
            this.currentWave = currentWave - 1;
        }
    }
}
