package f_abstractClass_interface.practice.animal_interfaceEdible.fruit;

import f_abstractClass_interface.practice.animal_interfaceEdible.edible.Edible;

public class Orange extends Fruit implements Edible {
    @Override
    public String howToEat(){
        return "Orange could be juiced";
    }
}
