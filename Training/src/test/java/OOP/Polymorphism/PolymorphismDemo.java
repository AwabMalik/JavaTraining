package OOP.Polymorphism;
class animal {
    public animal(String name) {
    }

    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class dog extends animal {
    public dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class cat extends animal {
    public cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {

        animal[] animals = {new dog("Fido"), new cat("Mittens")};
        for (OOP.Polymorphism.animal animal : animals) {
            animal.makeSound();

        }
    }
}