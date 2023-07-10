
abstract class Shape {
    abstract public double calculateArea(); 

}  

    



class Rectangle extends Shape {
  
      private double length; 
      private double width; 
      
       public Rectangle(double length , double width) {
        this.length = length; 
        this.width = width; 

       }

    @Override
    public double calculateArea() {
        
        double areaOfRectangle = length*width; 
        return areaOfRectangle; 
    }  

}


    class Circle extends Shape {
          
        private double radius;
        public Circle(double radius) {
           this.radius = radius;  
        }

        @Override
        public double calculateArea() {
          
            double areaOfCircle = Math.PI * radius * radius; 
            return areaOfCircle;

        }

    }
     
    class Triangle extends Shape { 

        private double base; 
        private double height;
        
        public Triangle(double base, double height) {
            
            this.base = base; 
            this.height = height; 

        }

        @Override
        public double calculateArea() {
           
            double areaOfTriangle =  0.5 * height *base; 
            return areaOfTriangle; 
        }
    }

   
    

class ShapeCalculator {

    public void printArea(Shape shape) {
         
      System.out.println("The Area is : " +shape.calculateArea());



    }
}




public class Questio2 { 


    public static void main(String[] args) {
        
        /*Create a superclass called Shape with an abstract method calculateArea() 
    that returns the area of the shape. Implement subclasses Rectangle, Circle, 
    and Triangle that inherit from the Shape class. Implement the calculateArea() 
    method in each subclass to calculate and return the area of a rectangle, circle,
    and triangle, respectively. Then, create a class called ShapeCalculator with a
    method printArea(Shape shape) that accepts an object of type Shape and prints
    its area. Demonstrate polymorphism by passing instances of different 
    subclasses to the printArea() method.

 */  

       Shape rectangle = new Rectangle(5,7); 
       
       Shape triangle = new Triangle(4,6);
       
       Shape circle = new Circle(5); 


       ShapeCalculator  calculator = new ShapeCalculator();
       
       calculator.printArea(rectangle); 
       calculator.printArea(triangle); 
       calculator.printArea(circle); 
        


 

    }
  
  
    
}

    


