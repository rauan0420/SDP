package Factory;

public class FactoryDesignPattern {

    public static void main(String args[]) {
        CreatingNewspaper newspaperdesign = new Newspaperdesign();
        Newspaper DailyNewspaper = newspaperdesign.createNewspaper("DailyNewspaper");
        Newspaper NightNewspaper = newspaperdesign.createNewspaper("NightNewspaper");
    }
}


