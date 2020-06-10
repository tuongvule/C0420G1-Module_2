package f_abstractClass_interface.practice.animal_interfaceEdible.animal;

import f_abstractClass_interface.practice.animal_interfaceEdible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
     return "Chicken: cluck-cluck";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
