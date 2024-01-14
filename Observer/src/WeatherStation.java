import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements ISubject {
  private int temperature;
  private final List<IObserver> observers = new ArrayList<>();

  public WeatherStation(int temperature) {
    this.temperature = temperature;
  }

  public void addObserver(IObserver observer) {
    observers.add(observer);
  }

  public void removeObserver(IObserver observer) {
    observers.remove(observer);
  }

  public void notifyObservers() {
    observers.forEach(observer -> observer.update(temperature));
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
    notifyObservers();
  }
}
