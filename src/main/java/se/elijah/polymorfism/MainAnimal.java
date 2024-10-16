package se.elijah.polymorfism;

public class MainAnimal {
    public static void main(String[] args) {
        // Polymorphism: Holding references to Animal objects

        Animal myDog = new Dog();
        Animal myCat = new Cat();

        //dog fetch refrence
        // the method can be used to represent
        // specific behaviors unique to a class

        Dog betterDog = new Dog();
        betterDog.fetch();

        Cat betterCat = new Cat();
        betterCat.fetch();

        // Demonstrate polymorphism
        myDog.makeSound();
        myDog.Sleeping();

        myCat.makeSound();
        myCat.Sleeping();


    }


}
