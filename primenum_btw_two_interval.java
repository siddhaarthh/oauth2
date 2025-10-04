import java.util.Scanner;
public class primenum_btw_two_interval {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter num 1");
        int a=s.nextInt();
        System.out.println("enter num 2");
        int b=s.nextInt();
        int i,j,k=0;
        for(i=a;i>=b;i++)
        {
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {   
                k++; 
                break;  
                }
            }
            if(k==0)
            System.out.println(i + " ");
        }
        
    }
}
