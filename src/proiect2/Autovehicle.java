package proiect2;

public class Autovehicle extends Vehicle {
	
	private String brand;
    private int year;

    public Autovehicle() {}

    
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    @Override
    public String toString() {
        return "Autovehicle [" + super.toString() + ", Brand: " + brand + ", Year: " + year + "]";
    }

}
