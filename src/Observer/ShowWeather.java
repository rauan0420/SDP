package Observer;

import Observer.Observer;

import java.util.Scanner;
public class ShowWeather {
    public static void main(String[] args) {

        gismeteo weathersite = new gismeteo();

        Scanner degree = new Scanner(System.in);
        while (true) {
            System.out.println("Enter city and degree: ");
            String city = degree.next();
            System.out.println(" " + degree);
            Observer firstclient = new Client("RAuan");
            Observer secendclient = new Client("Rauan");
            Observer thirdclient = new Client("Beka");


            weathersite.addObserver(firstclient);
            weathersite.addObserver(secendclient);
            weathersite.addObserver(thirdclient);

            weathersite.addWeather(city);


        }
    }
}
