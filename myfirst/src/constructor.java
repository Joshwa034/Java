import javax.sound.midi.Soundbank;

class animal{
    //  this is a constructor
    animal(){
        System.out.println("made a constructor ");
    }
    public void eats(){
        System.out.println("animals is eating");

    }
}

class tiger extends animal{
    //  this is a constructo
    tiger(){
        System.out.println("made a horse constructor");
    }
    public void eats() {
        System.out.println("tiger eats ");
        
    }

}
public class constructor {
    public static void main(String[] args) {

        tiger tig = new tiger();
        // first creates a constructor th horse constructor() - constructor chaining 
    }
    
}
