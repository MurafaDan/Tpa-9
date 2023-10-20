
public interface Animal {
    char eat(String food);
    char makeSound();
    public static int sleep = 9;
    public default int temperature(){
        return(10);

    }
}
