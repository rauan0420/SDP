package Observer;

import java.util.List;

public class Client implements Observer {
    String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void processEvent(List<String> weather) {
        System.out.println(name + ", changes in the weather\n " + weather);
    }
}
