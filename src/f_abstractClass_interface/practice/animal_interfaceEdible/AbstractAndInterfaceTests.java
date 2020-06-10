package f_abstractClass_interface.practice.animal_interfaceEdible;
import f_abstractClass_interface.practice.animal_interfaceEdible.animal.Animal;
import f_abstractClass_interface.practice.animal_interfaceEdible.animal.Chicken;
import f_abstractClass_interface.practice.animal_interfaceEdible.animal.Tiger;
import f_abstractClass_interface.practice.animal_interfaceEdible.edible.Edible;
import f_abstractClass_interface.practice.animal_interfaceEdible.fruit.*;
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal [] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for(Animal  animal: animals){
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken){
                Edible edibler = (Chicken)animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit [] fruits = new Fruit[2];
        fruits[0]=new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit: fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
