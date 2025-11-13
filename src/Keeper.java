public class Keeper {

    private Dog assignedDog;

    public Keeper(Dog d) {
        this.assignedDog = d;
    }

    public void feedAnimal() {
        assignedDog.eat(); // dependency → Dog
    }

    public void checkAge() {
        if (assignedDog != null) { // IF → complexity
            assignedDog.birthday();
        }

        switch (assignedDog.age) { // SWITCH → complexity
            case 0:
                System.out.println("Newborn");
                break;
            case 1:
                System.out.println("Young");
                break;
            default:
                System.out.println("Adult");
        }
    }
}
