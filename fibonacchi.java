import java.util.Scanner;

public class fibonacchi {
    public int fib(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else
        {
            return fib(n-1)+(n+1);
        }
        
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the no terms you want ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        fibonacchi obj=new fibonacchi();
            
            int ans=obj.fib(n);
            System.out.println(ans);
           sc.close(); 
    }
}