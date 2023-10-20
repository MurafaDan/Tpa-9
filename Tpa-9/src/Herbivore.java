public abstract class Herbivore extends Elephant {

    public Herbivore(String name) {
        super(name);
    }

    public static void sleep() {
    }


    @Override
    public char eat(String food) {
        System.out.println(" Is eating " + food + "from Herbivore");
        return 0;
    }

    @Override
    public char makeSound() {
        System.out.println(" trumpets loudly from Herbivore");
        return 0;
    }


}
