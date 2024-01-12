import java.util.Scanner;

public class excp {
    public static void main(String[] args){
        System.out.println("only enter 1 or 2 ");
        Scanner sc = new Scanner(System.in);
        int[] a = {2,3,4};
        int y = sc.nextInt();
        try{
            System.out.println(a[y]);

        }
        catch(Exception exception){

        }
         
    }
}
