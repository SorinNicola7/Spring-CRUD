package proiect2;

public class Vehicle {
    private int price;
    private int maxSpeed;

    public Vehicle() {} 

    public Vehicle(int price, int maxSpeed) {
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    // Getteri si Setteri
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
    public int getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }

    @Override
    public String toString() {
        return "Price: " + price + ", MaxSpeed: " + maxSpeed;
    }
}
