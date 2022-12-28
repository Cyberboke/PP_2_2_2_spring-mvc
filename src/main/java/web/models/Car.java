package web.models;

public class Car {
    private String model;
    private int series;
    private int id;

    public Car(int id, String model, int series) {
        this.model = model;
        this.series = series;
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
