public class Dog extends Animal {

    public void makeSound() {
        System.out.println("Woof!");
    }


    public static void main(String[] args) {
       Dog dog = new Dog();

       dog.makeSound();
    }
}


