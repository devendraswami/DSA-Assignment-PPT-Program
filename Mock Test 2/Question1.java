


public class Question1 {
    public static void main(String[] args) {
        
        /*1. Create a superclass called Animal with a method makeSound() that prints
         the sound made by the animal. Implement subclasses Dog, Cat, and Cow that
          inherit from the Animal class. Implement the makeSound() method in each 
          subclass to print the sound made by a dog, cat, and cow, respectively. */ 

          Animal cat = new Cat(); 
          cat.makeSound();

          Animal dog = new Dog(); 
           dog.makeSound(); 

           Animal cow = new Cow();
            
           cow.makeSound(); 


    }
} 
 
// Classes for the Question 1 

class Animal {
    
    public void makeSound() {
        System.out.println("Animals Make Sound ");
    }
} 

class Dog extends Animal {

    @Override
    public void makeSound() {
         System.out.println("Bark... Bark.....Bark ");
    }
}

class Cat extends Animal {

    @Override 
    public void makeSound() {
        System.out.println("Meow...Meow...Meow....");
    }
} 

class Cow extends Animal {

    @Override 
    public void makeSound() {
        System.out.println("Moo ... Moo .. Moo "); 
    }
}