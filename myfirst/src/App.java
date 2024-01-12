import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a = 10;
        float b= 10.1F;
        if (a==b){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

        String name = "joswha";
        System.out.println(name.length());
        String name2 = "Fernandes";
        System.out.println(name + name2);

        String name3 = name2.replace('n', 'u');
        System.out.println(name3);

        String val = "name and nmae2";
        System.out.println(val.substring(2,4));


        // strings are immutable 

        // arrays 
        int[] marks = new int[3]; //new bcs its non premetive 
        marks[0] = 75;
        marks [1] = 87;
        marks[2] = 39;

        System.out.println(marks[1]);

        System.out.println(marks.length);

        // sorting 

        Arrays.sort(marks);


        int[] marks1 = {34, 55, 43};

        int [][] allmarks = {{34,54,65}, {78,23,54}};
        System.out.println(allmarks[1][1]);


        // casting inplicit casting , explicit casting 
        double n = 10.90;
        double j = n +2;

        // int k = 3 + j;
        int i = 3 + (int)j;

        // constant 
        final int nn = 34;
        // nn = 45;

        // max,min 
        System.out.println(Math.max(3, 6));
        System.out.println(Math.min(3, 6));
        System.out.println(Math.random() * 100);


        Scanner sc = new Scanner(System.in);
        System.out.println("name ");
        int k = sc.nextInt();
        System.out.println(k);

        String kj = sc.next();
        System.out.println(kj);

        














    }
}
