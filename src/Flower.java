public class Flower {
    String name;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower() {
        flowerColor = "белый";
        country = "Россия";
        cost = 1;
        lifeSpan = 3;
    }

    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        this.name = name;

        setFlowerColor(flowerColor);

        setCountry(country);

        setCost(cost);

        if (lifeSpan <= 0) lifeSpan = 3;
        this.lifeSpan = lifeSpan;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null) flowerColor = "";
        if (!flowerColor.equals("")) this.flowerColor = flowerColor;
        else this.flowerColor = "белый";
    }

    public void setCountry(String country) {
        if (country == null) country = "";
        if (!country.equals("")) this.country = country;
        else this.country = "Россия";
    }

    public void setCost(double cost) {
        if (cost <= 0) cost = 1;
        this.cost = cost;
    }

    @Override
    public String toString() {
        String dayWord;
        switch (lifeSpan){
            case 1: dayWord = "день";
            break;
            case 2:
            case 3:
            case 4: dayWord = "дня";
                break;
            default: dayWord = "дней";
        }
        return String.format("%s, цвет - %s, страна происхождения - %s, стоимость - %.2f рублей, срок стояния - %d %s.",
                name, flowerColor, country, cost, lifeSpan, dayWord );
    }
}
