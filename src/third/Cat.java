package third;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Some sound sobrescrita");
    }
}
