import java.util.Scanner;

public class negetive {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the no");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<0)
        {
            System.out.println("Negetive");
        }
        else if(n>0)
        {
            System.out.println("Positive");
        }
        else{
            System.out.println("it is zero");
        }
        sc.close();
    }
}
