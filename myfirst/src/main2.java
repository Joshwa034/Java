import java.util.Scanner;
public class main2 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
        
            default:
                break;
        }


    }
}
