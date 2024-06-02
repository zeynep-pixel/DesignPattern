public abstract class Condiment extends Beverage{
    Beverage beverage;
    public abstract String getDescription();
    public double cost(){
        return 20+beverage.cost();
    }
}
