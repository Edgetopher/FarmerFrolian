package Witch;

import Arod.Rideable;
import Just.Field;

import java.util.ArrayList;
import java.util.List;
// TWO CONSTRUCTORS ONE IS A LIST SO I LET THE ANIMAL CAN EAT AND THE OTHER ONE IS SO THE ANIMAL CAN MAKE NOISE


public class Horse implements iAnimal, Rideable {

    // Animal is a NoiseMaker and Eater
    // Horse is an Animal and Rideable
    // Chicken is an Animal and a Produce which yield an EdibleEgg if hasBeenFertilized flag is false.


    public List<iEdible> stomach;
    public String noise;


    public Horse(){

    } // DEFAULT CONSTRUCTOR

    public Horse(List<iEdible> eatin)
    {
        stomach = eatin;
    } // CONSTRUCTOR (takes in a collection that it can eat)

    public void eat(iEdible e) {

        stomach.remove(e);

    }


    public void NoiseMaker(iNoise sound) {

        noise = sound.toString();


    }


    public String makeNoise() {

        return "EEHYYEHHYY";
    }







}
