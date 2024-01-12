    
public class continueBreak{
    public static void main(String[] args){
        int n = 0;
        while(true)
        {
            if(n ==3)
            {
                n++;
                continue;

            }
            System.out.println(n);
            n++;
            if(n == 5){
                break;
            }

        }
    }

}
