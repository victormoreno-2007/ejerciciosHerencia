package nineth;

public class Car extends Vehicle{
    @Override
    public void describe() {
        super.describe();
        System.out.println("clase hija y sobrescrita");
    }
}
