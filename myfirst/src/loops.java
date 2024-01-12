import java.util.Scanner;

public class loops {
    public static void main(String[] args){
        for(int i =0;  i <=19; i++){
            System.out.println("joshwa");
        }
        int a = 1;

        while(a<10){
            System.out.println("while");
            a++;
        }
        Scanner sc = new Scanner(System.in);
        
        int j = 0;
        do{
            System.out.println("enter no");
            j = sc.nextInt();

        }while(j >=0);
    }
}
