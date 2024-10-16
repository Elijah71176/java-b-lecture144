package se.elijah.polymorfism;

public abstract class Animal {

    //abstract method
   public abstract void makeSound();
//Concrete method
    public void Sleeping() {
        System.out.println(" Animal is sleeping ");



    }
}


//A concrete method is a method that is fully defined, meaning it
//has both a method signature and an implementation
// meant to be implemented by subclasses
// An abstract method is a method that is
// declared without an implementation. no body.
