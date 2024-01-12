// 4 types of inherit.. 

// base / parent class
class shape{
    String color;
    int length;
    int area;

}
// Derived class 
class box extends shape{

}



//1- single level inheritence 
class shape2{
    public void area() 
    {
        System.out.println("area");    
    }
}

class triangle extends shape2{
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}


//2- multilevel inheritence 
class eqtriangle extends triangle{
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}


//3- hierarchial inheritance
//  parent-shape ,child - triangle , eqtriangle , circle


//4- hybrid inheritance - all above types mixed

//5- multilevel inheritance - not in java class but in c++ 


public class inherit {
    //  inherit from other class
    public static void main(String[] args) 
    {
        box b1 = new box();
        b1.color ="red";
        b1.length = 84;
        b1.area = 34;
        // box class has no attributes but it inherits from parent
    }
}

