package Decorator;

abstract class Combo {
    String name = "Unnamed Combo";

    public String getInfo(){
        return name;
    }

    public abstract int getPrice();
}

abstract class Decorator extends Combo {
    public abstract String getInfo();
}


class Weather extends Combo {
    public Weather(){
        name = "Weather";
    }

    public int getPrice(){
        return 10;
    }
}

class News extends Decorator{
    Combo combo;

    public News(Combo combo){
        this.combo = combo;
    }

    public String getInfo() {
        return combo.getInfo() + " + News";
    }

    public int getPrice() {
        return combo.getPrice() + 15;
    }

}

class One_More_City extends Decorator{
    Combo combo;

    public One_More_City(Combo combo){
        this.combo = combo;
    }

    public String getInfo() {
        return combo.getInfo() + " + One More City";
    }

    public int getPrice() {
        return combo.getPrice() + 1;
    }
}

public class Price{
    public static void main(String[] args) {
        Combo PriceList = new Weather();
        System.out.println(PriceList.getInfo());
        System.out.println(PriceList.getPrice());

        PriceList = new News(PriceList);
        System.out.println(PriceList.getInfo());
        System.out.println(PriceList.getPrice());

        PriceList = new One_More_City(new News(new Weather()));
        System.out.println(PriceList.getInfo());
        System.out.println(PriceList.getPrice());
    }
}