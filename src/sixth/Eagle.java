package sixth;

public class Eagle extends Bird{
    @Override
    public void fly() {
        super.fly();
        System.out.println("ya esta sobrescrito");
    }
}
