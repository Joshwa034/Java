

public class JMbasic {
    public static void main(String[] args) {
        String name = "joshwa";
        int age = 34;
        long phn = 843787478;
        char gender = 'm';
        boolean stat = false;
//  arth op
        System.out.println(name);
        int a = 5;
        int b = 4;
        int c =  a*b - a-b * b;
        System.out.println(c);
//  shift op 
// (>> : right shift, val divided by 2)
// ex 5>>1 = 2 devide, 5>>2 = 1, 5>>3 = 0, expl 5<<2 = 5/2/2
// left shift ,  5<<1 = 10 double , expl 5<<2 = 5*2*2

        System.out.println("5 right shift 1 time : "+(5>>1));
        System.out.println("5 right shift 1 time : "+(5<<1));

    }
}
//  operators :
//  unary : increment, decriment(++,--) , 
// binary : arth, logical, bitwies, relational,shift, 
// ternary : conditional 