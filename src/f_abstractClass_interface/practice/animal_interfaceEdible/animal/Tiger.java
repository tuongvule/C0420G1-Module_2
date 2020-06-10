package f_abstractClass_interface.practice.animal_interfaceEdible.animal;

import f_abstractClass_interface.practice.animal_interfaceEdible.edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Tiger: roarrrrrr";
    }

    @Override
    public String howToEat() {
        return "could be boiled";
    }

//    @Override
//    public String howToEat() {
//        return null;
//    }
}
