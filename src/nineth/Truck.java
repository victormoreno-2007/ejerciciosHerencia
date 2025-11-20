package nineth;

public class Truck extends Vehicle{
    @Override
    public void describe() {
        super.describe();
        System.out.println("clase hija y sobrescrita");
    }
}
