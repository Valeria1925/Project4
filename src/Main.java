
import com.company.animals.*;
import foods.Herb;
import foods.Meat;
import foods.WrongAviarySizeException;

public class Main {

    public static void main(String[] args) throws WrongAviarySizeException {
        Aviary<Animal> aviary1 = new Aviary<>(3, AviarySize.SMALL);

        try {
            aviary1.addAnimal(new Duck("donald"));
            aviary1.addAnimal(new Cow("Mumu"));
        } catch (WrongAviarySizeException exc) {
            System.out.println(exc);
        }

        aviary1.addAnimal(new Cow("Malyshka"));
        aviary1.checkHealth();
    }
}
