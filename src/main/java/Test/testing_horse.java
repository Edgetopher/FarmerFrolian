package Test;

import Jesus.Tomato;
import Witch.Horse;
import Witch.iEdible;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class testing_horse {

    public List <iEdible> basket = new ArrayList<iEdible>();
    public Horse horse = new Horse(basket);
    public Tomato tomato = new Tomato();

    @Test
    public void testing (){

        //when
 //       basket.add(tomato);


        //while

        for (int i = 0; i < basket.size(); i++) {


            horse.eat(basket.get(i));

        }

        //then
        Assert.assertEquals( 0,basket.size());
    }

    @Test
    public void instanceTest(){

      Assert.assertTrue(tomato instanceof iEdible);
    }


}
