public class Main {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        FlyBehavior fb = new FlyNoWay();
        duck.setFlyBehavior(fb);
        duck.performFly();
    }
}
