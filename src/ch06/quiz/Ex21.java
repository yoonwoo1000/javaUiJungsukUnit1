package ch6.quiz;

public class Ex21 {
    public static void main(String[] args) {

    }
}

class MyTv {
    boolean isPowerOn;
    int channel;
    int volum;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff() {
        isPowerOn = !isPowerOn;
    }

    void volUp() {
        if (volum < MAX_VOLUME) {
            volum++;
        }
    }

    void volDown() {
        if (volum > MIN_VOLUME) {
            volum--;
        }
    }

    void channelUp() {
        if (channel == MAX_CHANNEL) {
            channel = MIN_CHANNEL;
        } else {
            channel++;
        }
    }

    void channelDown() {
        if (channel == MIN_CHANNEL) {
            channel = MAX_CHANNEL;
        } else {
            channel--;
        }
    }
}
