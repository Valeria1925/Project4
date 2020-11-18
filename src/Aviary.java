import com.company.animals.Animal;
import com.company.animals.AviarySize;
import foods.WrongAviarySizeException;

import java.util.HashMap;

public class Aviary<Alias extends Animal> {
    private HashMap<String, Alias> seats = new HashMap<String, Alias>();
    int occypiedSeats;
    int maxSeats;
    AviarySize size;

    public Aviary(int maxSeatsFrom, AviarySize size) {
        maxSeats = maxSeatsFrom;
        occypiedSeats = 0;
        this.size = size;
    }

    void addAnimal(Alias animal) throws WrongAviarySizeException {
        if (animal.size != this.size) {
            throw new WrongAviarySizeException("The size is not appropriate");
        }

        if (occypiedSeats < maxSeats) {
            seats.put(animal.name, animal);
            occypiedSeats = occypiedSeats + 1;
            System.out.println("Animal added");
        } else {
            System.out.println("All seats occupied");
        }
    }

    void removeAnimal(String name) {
        System.out.println("Remove " + name);
        seats.remove(name);
    }

    Alias getAnimal(String name) {
        return seats.get(name);
    }

    void calculateAnimals() {
        System.out.println("animals: " + occypiedSeats);
    }

    void checkHealth() {
        seats.forEach((key, value) -> {
            value.checkHealth();
        });
    }
}
