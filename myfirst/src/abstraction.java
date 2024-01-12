abstract class animal {
    abstract void walk();
    public void eats() {
        System.out.println("eats ");
    }

}
class Horse extends animal{
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class hen extends animal {
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}


public class abstraction {
    public static void main(String[] args) {

        Horse h1 = new Horse();
        h1.walk();
        hen h2 = new hen();
        h2.walk();

        
    }
}
