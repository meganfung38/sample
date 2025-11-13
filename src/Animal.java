public interface Animal {
    void eat();
}

abstract class Mammal implements Animal {
    protected int age;

    public void birthday() {
        age++;
    }

    public boolean isOld() {
        return age > 10; // IF → complexity
    }
}

public class Dog extends Mammal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        if (age < 2) {        // IF → complexity
            System.out.println("Puppy eats milk");
        } else {
            System.out.println("Dog eats food");
        }
    }

    public void bark() {
        for (int i = 0; i < 3; i++) { // FOR → complexity
            System.out.println("Woof");
        }
    }
}
