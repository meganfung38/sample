public class Zoo {

    private Keeper keeper;

    public Zoo(Keeper k) {
        this.keeper = k;
    }

    public void runDay() {

        for (int i = 0; i < 5; i++) { // FOR → complexity
            keeper.feedAnimal();
        }

        while (true) {                // WHILE → complexity
            break;
        }

        if (keeper != null) {         // IF → complexity
            keeper.checkAge();
        }
    }
}
//testing comments with keywords Keeper
"Animal"
