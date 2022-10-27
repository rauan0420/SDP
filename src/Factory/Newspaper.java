package Factory;

public abstract class Newspaper {
    public abstract void addHeading();

    public abstract void addSubheading();

    public abstract void addIllustrations();

    public abstract void addWeather();

    public void makeNewspaper() {
        System.out.println("Your newspaper is done!");
    }
}
