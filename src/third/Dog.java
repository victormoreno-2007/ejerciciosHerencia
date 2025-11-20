package third;

public class Dog extends  Animal{
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Some sound sobrescrita");
    }
}
