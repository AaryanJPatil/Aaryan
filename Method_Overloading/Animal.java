package MethodOverriding;
    class Animal{
        void display()
        {
            System.out.println("The animals sound are :");
        }

    }
    class Lion extends Animal{
        void AnimalSound(){
            System.out.println("The lion roars ");
        }
    }
    class Cat extends Animal{
        void AnimalSound(){
            System.out.println("The cat meows ");
        }
    }
    class Wolf extends Animal{
        void AnimalSound(){
            System.out.println("The wolf howls ");
        }
    }
    
public class MethodOverdingAnimal {
    public static void main (String args[]) {
        Animal animal=new Animal();
        animal.display();
        Lion lion =new Lion();
        lion.AnimalSound();
        Cat cat=new Cat();
        cat.AnimalSound();
        Wolf wolf=new Wolf();
        wolf.AnimalSound();
    }
    
}


