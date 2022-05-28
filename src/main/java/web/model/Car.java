package web.model;


public class Car {
    private String model;
    private int cost;
    private String country;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Car(String model, int cost, String country) {
        this.model = model;
        this.cost = cost;
        this.country = country;
    }

    @Override
    public String toString() {
        return  "model='" + model + '\'' +
                ", cost=" + cost +
                ", country='" + country + '\'';
    }
}
