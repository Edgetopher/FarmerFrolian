package Witch;

import java.util.ArrayList;
import java.util.List;

public class Chicken extends Produce implements iAnimal {
    boolean hasFertalized;
    public String noise;

    // Animal is a NoiseMaker and Eater
    // Horse is an Animal and Rideable
    // Chicken is an Animal and a Produce which yield an EdibleEgg if hasBeenFertilized flag is false.


    List<iEdible> foodEaten = new ArrayList<iEdible>();

    public Boolean yield() throws Exception {
        if (hasFertilized() != hasFertalized) {
            throw new Exception("This chicken has been fertilized and it doesn't produce edible eggs.");
        } else {

            return true;
        }
    }

    private boolean hasFertilized() {
        return true;
    }


    public void eat(iEdible e) {
        foodEaten.add(e);
    }

    public void NoiseMaker(iNoise sound) {  noise = sound.toString();
    }


    public List<iEdible> getFoodEaten() {
        return foodEaten;
    }


    public String makeNoise() {
        return "Cluck-cluck-cluck!";
    }

    public static List<Chicken> makeChickens(int numberOfChickens) {
        List<Chicken> chickens = new ArrayList<Chicken>();
        for (int i = 0; i < numberOfChickens; i++) {
            chickens.add(new Chicken());
        }
        return chickens;
    }


}
