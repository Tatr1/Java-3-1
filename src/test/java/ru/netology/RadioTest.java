package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void outMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void outMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void outMaxWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(10);
        int actual = radio.getCurrentWave();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void outMinWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(-1);
        int actual = radio.getCurrentWave();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void itCreateAndWorks() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.setCurrentWave(5);
        int actualV = radio.getCurrentVolume();
        int actualW = radio.getCurrentWave();
        int expected = 5;
        assertEquals(expected, actualV);
        assertEquals(expected, actualW);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/increaseVolumeData.csv")
    void increaseVolume(String name, int setCurrentVolume, int expected) {
        Radio radio = new Radio();
        radio.increaseVolume(setCurrentVolume);
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/decreaseVolumeData.csv")
    void decreaseVolume(String name, int setCurrentVolume, int expected) {
        Radio radio = new Radio();
        radio.decreaseVolume(setCurrentVolume);
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/increaseWaveData.csv")
    void increaseWave(String name, int setCurrentWase, int expected) {
        Radio radio = new Radio();
        radio.increaseWave(setCurrentWase);
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/decreaseWaveData.csv")
    void decreaseWave(String name, int setCurrentWase, int expected) {
        Radio radio = new Radio();
        radio.decreaseWave(setCurrentWase);
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }
}