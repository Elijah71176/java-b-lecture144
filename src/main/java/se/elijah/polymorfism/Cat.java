package se.elijah.polymorfism;

public class Cat extends  Animal{
    @Override
    public void makeSound() {
        System.out.println(" Meowwwww ");
    }

    public void fetch(){
        System.out.println(" Cat is fetching ball ");

    }
}
