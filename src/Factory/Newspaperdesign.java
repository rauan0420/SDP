package Factory;

public class Newspaperdesign extends CreatingNewspaper {
    @Override
    public Newspaper createNewspaper(String type) {
        Newspaper newspaper;
        switch (type.toLowerCase())
        {
            case "dailynewspaper":
                newspaper = new DailyNewspaper();
                break;
            case "nightnewspaper":
                newspaper = new NightNewspaper();
                break;

            default: throw new IllegalArgumentException("No such Newspaper");
        }

        newspaper.addHeading();
        newspaper.addIllustrations();
        newspaper.addSubheading();
        newspaper.addWeather();
        newspaper.makeNewspaper();
        return newspaper;

    }
}
