public class Crop {
    private String name;
    private String type;
    private double yield;

    // Constructor, Getters, and Setters
    public Crop(String name, String type, double yield) {
        this.name = name;
        this.type = type;
        this.yield = yield;
    }

    // Getters and Setters
     public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getYield() {
        return yield;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYield(double yield) {
        this.yield = yield;
    }
}