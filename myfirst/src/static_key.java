class student {
    String name;
    static String school;
    // this remains constant for all 
    // only takes single memory, obj take multiple
}

public class static_key {
    public static void main(String[] args) {
        student.school = "vidianjali";

        student s = new student();
        s.name = "joshwa";
    }
    
}
