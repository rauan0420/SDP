package Observer;

import java.util.ArrayList;
import java.util.List;

public class gismeteo implements Observed {
    List<String> weather = new ArrayList<>();

    List<Observer> client = new ArrayList<>();

    public void addWeather (String weather){
        this.weather.add(weather);
        notifyObservers();
    }

    public void removeWeather(String weather){
        this.weather.remove(weather);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
    this.client.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
    this.client.remove(observer);
    }

    @Override
    public void notifyObservers() {
    for (Observer observer : client) {
        observer.processEvent(this.weather);
    }
    }
}
