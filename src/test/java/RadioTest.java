import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void currentStation() {
        Radio rad = new Radio();

        int expected = rad.getMinStation() + 1;
        rad.setCurrentStation(expected);
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStation2() {
        Radio rad = new Radio();

        int expected = rad.getMinStation();
        rad.setCurrentStation(expected);
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStation3() {
        Radio rad = new Radio();

        int expected = rad.getMinStation();
        rad.setCurrentStation(expected - 1);
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStation4() {
        Radio rad = new Radio();

        int expected = rad.getCurrentStation();
        rad.setCurrentStation(20);
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStation5() {
        Radio rad = new Radio();

        int expected = rad.getMaxStation() - 1;
        rad.setCurrentStation(expected);
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStation6() {
        Radio rad = new Radio();

        int expected = rad.getMaxStation();
        rad.setCurrentStation(expected);
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation1() {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getMaxStation());
        rad.next();

        int expected = rad.getMinStation();
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation2() {
        Radio rad = new Radio();
        int expected = rad.getCurrentStation() + 1;
        rad.next();
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev1() {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getMinStation());
        rad.prev();
        int expected = rad.getMaxStation();
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev2() {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getMinStation());
        rad.prev();
        int expected = rad.getMaxStation();
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev3() {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getMaxStation());
        rad.prev();
        int expected = rad.getMaxStation() - 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio rad = new Radio();
        int expected = rad.getCurrentVolume() + 1;
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void reduceVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMaxVolume() / 2);
        int expected = rad.getCurrentVolume() - 1;
        rad.reduceVolume();
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMinVolume());
        int expected = rad.getMinVolume();
        rad.reduceVolume();
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMaxVolume());
        int expected = rad.getMaxVolume();
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMaxVolume());
        int expected = rad.getMaxVolume();
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMaxVolume() {
        Radio rad = new Radio();
        int expected = rad.getCurrentVolume();
        rad.setCurrentVolume(rad.getMaxVolume() + 1);
        rad.setCurrentVolume(rad.getMinVolume() - 1);
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sizeStation() {
        Radio rad = new Radio(4);
        Assertions.assertEquals(4, rad.getMaxStation() - rad.getMinStation() + 1);
    }

}