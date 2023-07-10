

interface Drawable {
    void draw();
} 

class Rectangle implements Drawable {

    @Override
    public void draw(){
            System.out.println("Drawing a Rectangle"); 

    } 
    
} 

class Circle implements Drawable {

    @Override
    public void draw() {
       System.out.println("Drawing a Rectangle");

    }
    
}




public class Question4 {
   public static void main(String[] args) {
     
    /*4. Create an interface called Drawable with a method draw() that has no
     implementation. Implement this interface in classes Circle and Rectangle.
      Write a program that creates objects of Circle and Rectangle and calls the 
      draw() method on each object. */ 
    Drawable rec = new Rectangle();
       rec.draw();

    Drawable cir = new Circle();
       cir.draw();

   }
}
