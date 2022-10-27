package Factory;

public class NightNewspaper extends Newspaper {

    @Override
    public void addHeading() {
        System.out.println("Adding Heading for NightNewspaper.");
    }

    @Override
    public void addSubheading() {
        System.out.println("Adding Subheading for NightNewspaper.");

    }

    @Override
    public void addIllustrations() {
        System.out.println("Adding Illustrations for NightNewspaper.");

    }

    @Override
    public void addWeather() {
        System.out.println("Adding Weather for NightNewspaper.");

    }
}
