class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing");
    }

    public void color(){
        System.out.println(this.color);
    }

    public void type(){
        System.out.println(this.type);
    }
}


class Student{
    String name;
    int age;
    public void name() {
        System.out.println(this.name);
        System.out.println(this.age);

        
    }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;

    }
    Student(){

    }
}




public class oops {

    public static void main(String[] args) {

        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";

        pen1.write();
        pen1.color();
        pen1.type();

        // constructor with args 
        Student s = new Student();
        s.name = "joshwa";
        s.age = 23;
        Student s2 = new Student(s);
        // no init for s2 direct copy s
        s2.name();
        
    } // no distructor , it automatically detect garbage , using garbage collector
}
