package proiect2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
        // Incarcam contextul
        ApplicationContext context = new FileSystemXmlApplicationContext("beans_proiect.xml");

        // Extragem 5 obiecte, dar le salvam in referinte de tip Vehicle (Polimorfism)
        Vehicle v1 = (Vehicle) context.getBean("auto1");
        Vehicle v2 = (Vehicle) context.getBean("auto2");
        Vehicle v3 = (Vehicle) context.getBean("truck1");
        Vehicle v4 = (Vehicle) context.getBean("truck2");
        Vehicle v5 = (Vehicle) context.getBean("motoBean"); // ID-ul din @Component

        // Afisam obiectele
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
        System.out.println(v4.toString());
        System.out.println(v5.toString());
    }

	
	
}
