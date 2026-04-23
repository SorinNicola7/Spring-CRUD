package proiect2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("motoBean") // Spunem lui Spring ca acesta este un Bean
public class Motorcycle extends Vehicle {
    
    @Value("Sport") // Injectam valoarea direct
    private String type;

    public Motorcycle() {
        
        super.setPrice(5000);
        super.setMaxSpeed(280);
    }

    @Override
    public String toString() {
        return "Motorcycle [" + super.toString() + ", Type: " + type + "]";
    }
}