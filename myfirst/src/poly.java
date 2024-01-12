
class Student{
    String name;
    int age;
//  same function name is - function overoading
    public void info(String name) {
        System.out.println(this.name);
        
    }
    public void info(int age) {
        System.out.println(this.age);
        
    }
    // complie time and run time exception
    public void info(String name , int age ){
        System.out.println(name+" "+age);
    }

}

public class poly {
    
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.info("josh", 23);



        

        
    }
}
