
import com.company.animals.*;
import foods.Herb;
import foods.Meat;

public class Main {

    public static void main(String[] args) {


        Aviary<Cow> aviary1 = new Aviary<Cow>(3);
        aviary1.addAnimal(new Cow("Murka"));
        aviary1.addAnimal(new Cow("Mumu"));
        aviary1.addAnimal(new Cow("Malyshka"));
        aviary1.checkHealth();

        aviary1.removeAnimal("Malyshka");
        aviary1.checkHealth();


        Cow cow = aviary1.getAnimal("Mumu");


    }
}
