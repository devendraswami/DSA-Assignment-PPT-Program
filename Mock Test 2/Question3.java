
class Person {
    private String name; 
    private int age; 
    private String address; 

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    } 
    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    } 


    

}




public class Question3 {  

    public static void main(String[] args) {
        
  

    /*3. Create a class called Person with private properties like name, age, and 
    address. Provide public getter and setter methods for these properties. Write
     a program that creates an instance of the Person class, sets values for its
      properties using the setter methods, and displays the values using the getter
       methods. */   


       Person person = new Person(); 
       
        
       person.setName("Devendra");
        person.setAge(21); 
        person.setAddress("Bansur,Alwar"); 

        
       System.out.println("Name of the person is : " + person.getName()); 
       System.out.println("Age of the person is : " + person.getAge()); 
       System.out.println("Address of the person is " + person.getAddress());
    }
    
}
