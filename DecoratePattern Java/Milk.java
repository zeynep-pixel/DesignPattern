public  class Milk extends Condiment{
    public Milk(Beverage beverage){
      this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription();
    }
}
