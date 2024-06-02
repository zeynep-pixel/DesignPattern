public abstract class Duck{
    FlyBehavior flyBehavior;
   

    public  Duck(){

    }

    public void setFlyBehavior(FlyBehavior fb){
     flyBehavior = fb;
    }

    
    abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("All the ducks swim");
    }
}

