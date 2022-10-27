package Factory;

public class DailyNewspaper extends Newspaper {

    @Override
    public void addHeading() {
        System.out.println("Adding Heading for DailyNewspaper");
    }

    @Override
    public void addSubheading() {
        System.out.println("Adding Subheading for DailyNewspaper.");

    }

    @Override
    public void addIllustrations() {
        System.out.println("Adding Illustrations for DailyNewspaper.");

    }

    @Override
    public void addWeather() {
        System.out.println("Adding Weather for DailyNewspaper.");

    }
}
