package polymorphism;

public class Animal {
    public void animalSound(){
        System.out.println("the animal makes a roar");
        }
    }

    class pig extends Animal{
        public void animalSound(){
            System.out.println("The pig says oink");

        }
    }

    class cat extends Animal{
        public void animalSound(){
            System.out.println("The cat says meow");
        }
    }

    class Main{
        public static void main(String[] args){
            Animal myAnimal = new Animal();
            Animal myPig = new pig();
            Animal myCat = new cat();

            myAnimal.animalSound();
            myPig.animalSound();
            myCat.animalSound();
            
        }
    }

