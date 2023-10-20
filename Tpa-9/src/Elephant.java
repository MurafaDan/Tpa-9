public class Elephant implements Animal {


    private String name ;
    public Elephant(String name){
        this.name = name;
    }
@Override
    public char eat(String food) {
        System.out.println(name + " is eating " + food + "from Elephant");
    return 0;
}

@Override
    public char makeSound() {
        System.out.println(name + " trumpets loudly from Elephant.");
    return 0;
}

}
