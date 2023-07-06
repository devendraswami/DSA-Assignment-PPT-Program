
abstract class Vehicle {

    private String name; 
    private String model; 

    public Vehicle(String name, String model) {
        this.name = name; 
        this.model = model;
    } 

    public abstract void start();  

    public abstract void stop(); 

    public void gotDetails() {
        System.out.println("Name :  " + name);
        System.out.println("model " + model );
    }
} 


class Car extends Vehicle {

    public Car(String name, String model) {
        super(name, model);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void start() {
        System.out.println("The Car has been Started ");
    }

    @Override
    public void stop() {
       System.out.println("The Car Engine has been Stoped ");
    }
    
}



class program 
{
    public static void main(String[] args) {
        

        Vehicle obj = new Car("Toyota", "Fortuner"); 
        obj.start();
        obj.gotDetails();
        obj.stop();
    }
}