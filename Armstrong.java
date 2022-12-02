import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int number,temp=0,remainder,sum=0;
        System.out.println("Enter your no");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        temp=number;
        while(number>0)
        {
            remainder=number%10;
            number=number/10;
            sum=sum + remainder*remainder*remainder;
        }
        if(temp==sum)
        {
            System.out.println("The entered value is Armstrong a number");
        }
        else
        {
            System.out.println("The entered value is not Armstrong a number");
        }
        sc.close();
    }
}
