package se.elijah.polymorfism;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println(" Dog wowowowow ");


    }
    // Adding the fetch() method, to describe an action.
    public void fetch(){
        System.out.println(" The dog is fetching the ball ");


    }

}
