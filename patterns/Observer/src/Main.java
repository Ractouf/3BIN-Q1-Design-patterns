public class Main {

  public static void main(String[] args) {
    WeatherStation weatherStation = new WeatherStation(10);

    PhoneDisplay phoneDisplay = new PhoneDisplay();
    WindowDisplay windowDisplay = new WindowDisplay();

    weatherStation.addObserver(phoneDisplay);
    weatherStation.addObserver(windowDisplay);

    weatherStation.setTemperature(11);
  }
}
