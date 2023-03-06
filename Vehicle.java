package Cau2Lab5;

public class Vehicle {
    private String color;
    private String model;

    public Vehicle(String color, String model)
    {
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
