public class Espressobuzz {
    public static void main(String args[]){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "  " + beverage.cost());
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription() + "  " + beverage.cost());
        
    }
}
