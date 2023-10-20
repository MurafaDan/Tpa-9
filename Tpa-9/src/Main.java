public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant("petrea");
        System.out.println(elephant.eat("patrunjal"));
        System.out.println(elephant.makeSound());

        //Herbivore elephant1 = new Animal("Petrea1");
        Herbivore.sleep();


    }
}