
// interfaces in abstraction pure abstraction 
interface animal{
    // by default public 
    void walk();

}
interface harbivore {
     String type = "veg";
}
// in inheritance we had multiple inheritence - 2 base class properties in one child class , which is not possible by classes , its done by interfaces 

// multiple inherit - not possible by classes 

class horse implements animal, harbivore{
    public void walk() {
        System.out.println("walks on 4 feet");
        
    }
}



public class interfaces {
    public static void main(String[] args) {
        horse h1 = new horse();
        h1.walk();

        
    }
    
}
