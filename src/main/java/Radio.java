public class Radio {
    private int stationAmount;
    private int minStation = 0;
    private int currentStation = minStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio(int size) {
        stationAmount = size;
    }

    public Radio() {
        stationAmount = 10;
    }

    public void next() {
        if (currentStation != this.getMaxStation()) {
            currentStation++;
            return;
        }
        currentStation = minStation;
    }

    public void prev() {
        if (currentStation != minStation) {
            currentStation--;
            return;
        }
        currentStation = this.getMaxStation();
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > this.getMaxStation()) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxStation() {
        return minStation + stationAmount - 1;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMinVolume() {
        return minVolume;
    }
}