package proiect2;

public class Truck extends Vehicle {
	private int maxLoad;

   
    public Truck(int price, int maxSpeed, int maxLoad) {
        super(price, maxSpeed); // Apelam constructorul din Vehicle
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString() {
        return "Truck [" + super.toString() + ", MaxLoad: " + maxLoad + "]";
    }

}
