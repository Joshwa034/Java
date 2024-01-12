import java.util.Scanner;

public class main {
    public static void main( String[] args) {
        System.out.println("cash");

        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        
        if(w>0 && w<10){
            System.out.println("cannot buy ");
        }else if(w>10 && w<20){
            System.out.println("can buy one");
        }
        else{
        System.out.println("can buy both");
        }

        
    }
    
}
