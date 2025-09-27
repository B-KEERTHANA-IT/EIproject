import java.util.ArrayList;
import java.util.List;
interface Observer {
    void update(int temperature);
}
interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
class WeatherStation implements Subject {
    private int temperature;
    private List<Observer> observers = new ArrayList<>();

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }
}
class MobileApp implements Observer {
    public void update(int temperature) {
        System.out.println("MobileApp: Temperature updated to " + temperature + "°C");
    }
}
class LEDDisplay implements Observer {
    public void update(int temperature) {
        System.out.println("LED Display: Current Temperature = " + temperature + "°C");
    }
}
public class ObserverDemo {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer mobile = new MobileApp();
        Observer display = new LEDDisplay();

        station.addObserver(mobile);
        station.addObserver(display);

        System.out.println("---- Temperature Updates ----");
        station.setTemperature(30);
        station.setTemperature(25);
    }
}
